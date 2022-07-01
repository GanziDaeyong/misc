from rest_framework import status, viewsets
from rest_framework.response import Response
from django.utils import timezone
import datetime
from diary.models import Diary
from stats.models import WeeklyMood
from diary.serializers import DiarySerializer
from user.models import UserProfile

class DiaryViewSet(viewsets.GenericViewSet):
    queryset = Diary.objects.all()
    serializer_class = DiarySerializer

    def create(self, request):
        (user, data) = (request.user,request.data)
        serializer = self.get_serializer(data=data)
        serializer.is_valid(raise_exception=True)
        yearWeek = self._get_yearWeek()

        wkmdObj, created = WeeklyMood.objects.get_or_create(user=user, yearWeek=yearWeek)
        if created :
            wkmdObj.wkmd = [0]*14
            wkmdObj.avg = 0
            wkmdObj.total_write = 0
        self._update_wkmd(int(data.get('emotion')), wkmdObj)
        serializer.save()
        return Response(serializer.data, status=status.HTTP_201_CREATED)

    def _get_yearWeek(self):
        year=str(timezone.now().year)
        week=timezone.now().strftime("%V")
        return year + "/" + week

    def _update_wkmd(self, currMd, wkmdObj):
        #get day num
        dayNum=datetime.datetime.today().weekday()
        #give exp
        if wkmdObj.wkmd[dayNum+7]==0:
            self._get_exp(wkmdObj.user)
        #update md
        preSum = (wkmdObj.wkmd[dayNum]*1.0) * (wkmdObj.wkmd[dayNum + 7])
        wkmdObj.wkmd[dayNum + 7] += 1
        wkmdObj.wkmd[dayNum] = (preSum+currMd) / ((wkmdObj.wkmd[dayNum+7])*1.0)
        #update avg
        sum=0
        wrote_days=0
        for i in range(6):
             if wkmdObj.wkmd[i] != 0:
                 sum += wkmdObj.wkmd[i]
                 wrote_days+=1
        avg=sum/(wrote_days*1.0)
        wkmdObj.avg = avg
        wkmdObj.save()


## make a criteria ##
    def _get_exp(self, user):
        usObj = UserProfile.objects.get(user=user)
        usObj.exp += 5
        if usObj.exp >= 20:
            curr = self._update_curr(usObj.curr)
            usObj.curr = curr
            usObj.level += 1
            usObj.exp = 0

        usObj.save()

    def _update_curr(self, curr):
        splitted = list(curr)
        type = splitted[0]
        color = splitted[1]
        if color == "5":
            type = chr(ord(type) + 1)
            color = "1"
            ## 만렙 예외처리 필
        else:
            color = str(int(color) + 1)
        res = type + color
        return res



