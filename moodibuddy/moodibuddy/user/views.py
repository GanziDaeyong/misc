from django.db.transaction import atomic
from django.shortcuts import render
from django.contrib.auth import authenticate, login
from django.contrib.auth.models import User
from rest_framework import status, viewsets
from rest_framework.authtoken.models import Token
from rest_framework.permissions import AllowAny, IsAuthenticated
from rest_framework.decorators import action
from rest_framework.response import Response
from user.models import UserProfile, UserType
from user.serializers import UserSerializer, UserProfileSerializer, MainPageSerializer, MainPageForLoginSerializer
from django.contrib.auth.hashers import make_password
from django.core.mail import EmailMessage
from collections import OrderedDict
import string, random, re

# class CsrfExemptSessionAuthentication(SessionAuthentication):
#
#     def enforce_csrf(self, request):
#         return  # To not perform the csrf check previously happening

class DuplicateCheckViewSet(viewsets.GenericViewSet):
    # authentication_classes = (CsrfExemptSessionAuthentication, BasicAuthentication)

    @action(detail=False, methods=['get'])
    def username(self, request):
        username = request.data.get('username')
        try: User.objects.get(username=username)
        except User.DoesNotExist:
            return Response({'error':'no duplicates'}, status=status.HTTP_200_OK)
        return Response({'error':'duplicated username exists'}, status=status.HTTP_400_BAD_REQUEST)

    @action(detail=False, methods=['get'])
    def nickname(self, request):
        nickname = request.data.get('nickname')
        try: UserProfile.objects.get(nickname=nickname)
        except UserProfile.DoesNotExist:
            return Response({'error': 'no duplicates'}, status=status.HTTP_200_OK)
        return Response({'error': 'duplicated nickname exists'}, status=status.HTTP_400_BAD_REQUEST)


class EmailViewSet(viewsets.GenericViewSet):
    # authentication_classes = (CsrfExemptSessionAuthentication, BasicAuthentication)
    queryset = User.objects.all()

    def email_msg(self, type, key):
        if type=="EM":
            msg = {
                "title": "무디버디 이메일 인증",
                "content":"당신의 힐링 앱, 무디버디입니다.\n\n다음 이메일 코드를 무디버디 앱에 입력해주세요 : " + key
            }
        elif type=="ID":
            msg = {
                "title": "무디버디 아이디 찾기",
                "content":"당신의 힐링 앱, 무디버디입니다.\n\n귀하의 아이디는 [ " + key + " ] 입니다."
            }
        elif type=="PW":
            msg = {
                "title": "무디버디 비밀번호 초기화 알림",
                "content":"당신의 힐링 앱, 무디버디입니다.\n\n귀하의 비밀번호는 [ " + key + " ]로 초기화되었습니다.\n로그인 후 비밀번호를 변경해주세요."
            }
        return msg

    @action(detail=False, methods=['post'])
    def verification(self, request):
        email = request.data.get('email')
        idx = request.data.get('idx')
        if not email:
            return Response({'error':'no email given'}, status=status.HTTP_400_BAD_REQUEST)
        if not self.email_checker(email):
            return Response({'error': 'not a vaild form'}, status=status.HTTP_400_BAD_REQUEST)
        code = self.random_string_generator("s")
        msg = self.email_msg("EM", code)
        mail = EmailMessage(msg.get('title'), msg.get('content'), to=[email])
        mail.send()
        codeWrapper = OrderedDict()
        codeWrapper['idx'] = idx
        codeWrapper['code'] = code
        return Response(codeWrapper, status=status.HTTP_200_OK)

    def email_checker(self, email):
        splitted = re.split('@|\.', email)
        if len(splitted)!=3 : return False
        return True

    @action(detail=False, methods=['post'])
    def find_id(self, request):
        email = request.data.get('email')
        if not self.email_checker(email) :
            return Response({'error':'invalid email format'},status=status.HTTP_400_BAD_REQUEST)
        try: user=User.objects.get(email=email)
        except User.DoesNotExist:
            return Response({'error': 'email not registerd'}, status=status.HTTP_403_FORBIDDEN)
        msg = self.email_msg(type="ID", key=user.username)
        mail = EmailMessage(msg.get('title'), msg.get('content'), to=[email])
        mail.send()
        return Response(status=status.HTTP_200_OK)

    @action(detail=False, methods=['post'])
    def find_pw(self, request):
        email = request.data.get('email')
        username = request.data.get('username')
        if not self.email_checker(email) :
            return Response({'error':'invalid email format'},status=status.HTTP_400_BAD_REQUEST)
        try: user=User.objects.get(username=username,email=email)
        except User.DoesNotExist:
            return Response({'error': 'No matching user found.'}, status=status.HTTP_403_FORBIDDEN)
        code = self.random_string_generator("l")
        user.password = self.mkpw(code)
        user.save()
        msg = self.email_msg(type="PW", key=code)
        mail = EmailMessage(msg.get('title'), msg.get('content'), to=[email])
        mail.send()
        return Response(status=status.HTTP_200_OK)

    def mkpw(self, value):
        return make_password(value)

    def random_string_generator(self, type):
        if type=="s":
            return ''.join(random.choices(string.ascii_uppercase + string.digits, k=5))
        elif type=="l":
            return ''.join(random.choices(string.ascii_uppercase + string.digits, k=10))


class UserViewSet(viewsets.GenericViewSet):
    queryset = User.objects.all()
    permission_classes = (IsAuthenticated, )
    serializer_class = UserSerializer

    def get_permissions(self):
        if self.action in ('create', 'login'):
            return (AllowAny(),)
        return super(UserViewSet, self).get_permissions()
    @atomic
    def create(self, request):
        data = request.data
        serializer = self.get_serializer(data=data)
        serializer.is_valid(raise_exception=True)
        user = serializer.save()
        # grantType 예외처리 #
        if not self._create_usertype(request, user):
            return Response({'error': 'wrong grantType'}, status=status.HTTP_400_BAD_REQUEST)
        # self._create_userquest(user)
        # self._create_userstatus(user)
        self._create_userprofile(user)
        login(request, user)
        data = serializer.validated_data
        data['token'] = user.auth_token.key

        return Response(data, status=status.HTTP_201_CREATED)

    def _create_usertype(self, request, user):
        type= request.data.get('grantType')
        if (type!='OAUTH') and (type!='PASSWORD'):
            return False
        UserType.objects.create(user=user, type=type)
        return True

    def _create_userprofile(self, user):
        UserProfile.objects.create(user=user, nickname="not_specified*", level=1, exp=0, curr="A1", codeA="init", codeB="init",
                                   codeC="init")
        return True
    # def _create_userstatus(self, user):
    #     UserStatus.objects.create(user=user, level=1, exp=0, curr='A1')
    #     return True
    #
    # def _create_userquest(self, user):
    #     UserQuest.objects.create(user=user, codeA="init", codeB="init", codeC="init")
    #     return True

    @action(detail=False, methods=['PUT'])
    def login(self, request):
        username = request.data.get('username')
        password = request.data.get('password')
        user = authenticate(request, username=username, password=password)

        if user:
            login(request, user)
            data = self.get_serializer(user).data
            token, created = Token.objects.get_or_create(user=user)
            # data['token'] = token.key
            # return Response(data, status=status.HTTP_200_OK)
            upObj = UserProfile.objects.get(user=user)
            return Response(MainPageForLoginSerializer(upObj).data)
        return Response({"error": "Wrong username or wrong password"}, status=status.HTTP_403_FORBIDDEN)

    def list(self, request):
        queryset = User.objects.all()
        serializer = UserSerializer(queryset, many=True)
        return Response(serializer.data)

    def update(self, request, pk=None):
        if pk != 'me':
            return Response({"error": "No permission on other's info"}, status=status.HTTP_403_FORBIDDEN)
        (user, data) = (request.user, request.data)
        serializer = self.get_serializer(user, data=data, partial=True)
        serializer.is_valid(raise_exception=True)
        serializer.update(user, serializer.validated_data)
        return Response(serializer.data)


class UserProfileViewSet(viewsets.GenericViewSet):
    queryset = UserProfile.objects.all()
    serializer_class = UserProfileSerializer

    # def create(self, request):
    #     (data, user)=(request.data, request.user)
    #     is_exist=False
    #     try:
    #         check = self.queryset.get(user=user)
    #         if check : is_exist=True
    #     except UserProfile.DoesNotExist: pass
    #     if is_exist: return Response({'error':'Profile exists'}, status=status.HTTP_400_BAD_REQUEST)
    #     serializer = self.get_serializer(data=data)
    #     serializer.is_valid(raise_exception=True)
    #     user = serializer.save()
    #     data = serializer.validated_data
    # return Response(data, status=status.HTTP_201_CREATED)
    def create(self, request):
        return Response({'error': 'Unauthorized access'}, status=status.HTTP_403_FORBIDDEN)


    @action(detail=False, methods=['PUT'])
    def nickname(self, request):
        user = request.user
        upObj = UserProfile.objects.get(user=user)
        nickname=request.data.get("nickname")
        if nickname:
            #if nickname # limitation 작성
            upObj.nickname = nickname
            upObj.save()
        return Response(request.data, status=status.HTTP_200_OK)


class MainPageViewSet(viewsets.GenericViewSet):
    queryset = User.objects.all()
    serializer_class = MainPageSerializer

    @action(detail=False, methods=['GET'])
    def mainpage(self, request):
        user = request.user
        serializer = MainPageSerializer(user)
        return Response(serializer.data, status=status.HTTP_200_OK)

    @action(detail=False, methods=['POST'])
    def quest(self, request):
        user = request.user
        upObj = UserProfile.objects.get(user=user)
        acc_exp=0 #accumulating exp
        if request.data.get('quest_code_A') :
            upObj.codeA = request.data.get('quest_code_A')
        if request.data.get('quest_code_B') :
            upObj.codeB = request.data.get('quest_code_B')
        if request.data.get('quest_code_C') :
            upObj.codeC = request.data.get('quest_code_A')
        self._get_exp(user)
        upObj.save()
        return Response(status=status.HTTP_200_OK)

        ## make a criteria ##
    def _get_exp(self, user):
        upObj = UserProfile.objects.get(user=user)
        upObj.exp += 5
        if upObj.exp >= 20:
            curr = self._update_curr(upObj.curr)
            upObj.curr = curr
            upObj.level += 1
            upObj.exp = 0
        upObj.save()

    def _update_curr(self, curr):
        splitted = list(curr)
        type = splitted[0]
        color = splitted[1]
        if color=="5":
            type=chr(ord(type)+1)
            color="1"
            ## 만렙 예외처리 필
        else :
            color = str(int(color) + 1)
        res = type + color
        return res





