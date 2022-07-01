from django.contrib.auth.hashers import make_password
from django.contrib.auth.models import User
from rest_framework import serializers
from rest_framework.authtoken.models import Token
from user.models import UserProfile, UserType
from stats.models import WeeklyMood
from django.utils import timezone


class UserSerializer(serializers.ModelSerializer):
    username = serializers.CharField(required=True)
    password = serializers.CharField(write_only=True)
    email = serializers.CharField(required=True)
    date_joined = serializers.DateTimeField(read_only=True)
    user_profile = serializers.SerializerMethodField()
    is_specified = serializers.SerializerMethodField()
    user_type = serializers.SerializerMethodField()

    class Meta:
        model = User
        fields = (
            'id',
            'username',
            'password',
            'email',
            'date_joined',
            'user_type',
            'user_profile',
            'is_specified',
        )

    def get_user_profile(self, user):
        try:
            user_profile = UserProfile.objects.get(user=user)
        except:
            return None
        return UserProfileSerializer(user_profile).data

    def get_user_type(self, user):
        try:
            user_type = UserType.objects.get(user=user)
        except:
            return None
        return user_type.type

    def get_is_specified(self, user):
        try:
            user_profile = UserProfile.objects.get(user=user)
        except UserProfile.DoesNotExist:
            return 0
        return 1

    def validate_password(self, value):
        return make_password(value)

    def create(self, validated_data):
        user = super(UserSerializer, self).create(validated_data)
        Token.objects.create(user=user)
        return user


class UserProfileSerializer(serializers.ModelSerializer):
    # username = serializers.SerializerMethodField()
    nickname = serializers.CharField(required=True)

    # email = serializers.CharField(required=True)
    # age = serializers.IntegerField(required=False)
    # first_name = serializers.CharField(required=False)
    # last_name = serializers.CharField(required=False)
    # gender = serializers.ChoiceField(required=False, choices=UserProfile.gender_type)
    # job = serializers.CharField(required=False)

    class Meta:
        model = UserProfile
        fields = (
            # 'username',
            'nickname',
            # 'email',
            # 'age',
            # 'first_name',
            # 'last_name',
            # 'gender',
            # 'job',
        )

    def create(self, validated_data):
        # below will be implemented in version 2
        # #email = validated_data.pop('email')
        # age = validated_data.pop('age')
        # first_name = validated_data.pop('first_name', '')
        # last_name = validated_data.pop('last_name', '')
        # gender = validated_data.pop('gender')
        # job = validated_data.pop('job','')
        # user = self.context['request'].user
        # validated_data['user'] = user
        # # UserProfile.objects.create(nickname=nickname, email=email, age=age, first_name=first_name, last_name=last_name,
        # #                            gender=gender, job=job, user=user)
        nickname = validated_data.pop('nickname')
        user = self.context['request'].user
        UserProfile.objects.create(user=user, nickname=nickname, level=1, exp=0, curr="A1", codeA="init", codeB="init",
                                   codeC="init")
        return user


class MainPageSerializer(serializers.ModelSerializer):
    nickname = serializers.SerializerMethodField()
    weekly_mood = serializers.SerializerMethodField()

    class Meta:
        model = User
        fields = (
            'nickname',
            'weekly_mood',
            'codeA',
            'codeB',
            'codeC',
            'level',
            'curr',
            'exp',
        )

    def get_nickname(self, user):
        try:
            up = UserProfile.objects.get(user=user)
        except UserProfile.DoesNotExist:
            return None
        return up.nickname

    def get_weekly_mood(self, user):
        yearWeek = self._get_yearWeek();
        try:
            wkmdObj = WeeklyMood.objects.get(user=user, yearWeek=yearWeek)
        except WeeklyMood.DoesNotExist:
            return None
        return wkmdObj.wkmd[:7]

    def _get_yearWeek(self):
        year = str(timezone.now().year)
        week = timezone.now().strftime("%V")
        return year + "/" + week


class MainPageForLoginSerializer(serializers.ModelSerializer):
    weekly_mood = serializers.SerializerMethodField()
    token = serializers.SerializerMethodField()

    class Meta:
        model = UserProfile
        fields = (
            'nickname',
            'weekly_mood',
            'codeA',
            'codeB',
            'codeC',
            'level',
            'curr',
            'exp',
            'token',
        )

    def get_weekly_mood(self, upObj):
        user = upObj.user
        yearWeek = self._get_yearWeek();
        try:
            wkmdObj = WeeklyMood.objects.get(user=user, yearWeek=yearWeek)
        except WeeklyMood.DoesNotExist:
            return None
        return wkmdObj.wkmd[:7]

    def _get_yearWeek(self):
        year = str(timezone.now().year)
        week = timezone.now().strftime("%V")
        return year + "/" + week

    def get_token(self, upObj):
        user = upObj.user
        return str(Token.objects.get(user=user))



# class QuestSerializer(serializers.ModelSerializer):
#     class Meta:
#         model = UserQuest
#         fields = (
#             'codeA',
#             'codeB',
#             'codeC',
#         )
#

# ============================================
# status (lev) - 5마다 과일 종류 change, 1마다 색깔 change
#
# 1~4     - fruitA
# 5~9     - fruitB
# 10~14   - fruitC
# 15~19   - fruitD
# ...
#
# 1 : color1 (ex. 5,10,15)
# 2 : color2 (ex. 1,6,11,16)
# 3 : color3 (ex. 2,7,12,17)
# ...

# exp - 다이어리 두번 쓸때마다 1업? : 한달 열심히 하면 15.
# ============================================

#
# class StatusSerializer(serializers.ModelSerializer):
#     class Meta:
#         model = UserStatus
#         fields = (
#             'level',
#             'exp',
#             'curr',
#         )

    # def get_curr(self, userStatusObj):
    #     lev = userStatusObj.objects.get('level')
    #     type = ""
    #     col = ""
    #     if (lev%5)==0:
    #         col = "1"
    #     elif (lev%5)==1:
    #         col = "2"
    #     elif (lev%5)==2:
    #         col = "3"
    #     elif (lev%5)==3:
    #         col = "4"
    #     elif (lev%5)==4:
    #         col = "5"
    #
    #     if (0<=lev) and (lev<5) :
    #         type = "A"
    #     elif (5<=lev) and (lev<10) :
    #         type = "B"
    #     elif (10<=lev) and (lev<15) :
    #         type = "C"
    #     elif (15<=lev) and (lev<20) :
    #         type = "D"
    #     elif (20<=lev) and (lev<25) :
    #         type = "E"
    #
    #     return None
