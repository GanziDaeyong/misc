from rest_framework import serializers
from stats.models import WeeklyMood

class StatsSerializer(serializers.ModelSerializer):

    username = serializers.SerializerMethodField()
    year_week = serializers.SerializerMethodField()
    each_day_mood = serializers.SerializerMethodField()
    each_day_num = serializers.SerializerMethodField()
    avg_mood = serializers.SerializerMethodField()
    avg_write = serializers.SerializerMethodField()
    total_write = serializers.SerializerMethodField()

    class Meta:
        model = WeeklyMood
        fields = (
            'username',
            'year_week',
            'each_day_mood',
            'each_day_num',
            'avg_mood',
            'avg_write',
            'total_write',
        )

    def get_username(self, wkmdObj):
        return wkmdObj.user.username

    def get_year_week(self, wkmdObj):
        return wkmdObj.yearWeek

    def get_each_day_mood(self, wkmdObj):
        return wkmdObj.wkmd[:7]

    def get_each_day_num(self, wkmdObj):
        return wkmdObj.wkmd[7:]

    def get_avg_mood(self, wkmdObj):
        return float(format(wkmdObj.avg, '.2f'))

    def get_avg_write(self, wkmdObj):
        avg_write = (self.get_total_write(wkmdObj))*1.0 / 7.0
        return float(format(avg_write, '.2f'))

    def get_total_write(self, wkmdOjb):
        total=0
        for i in range(6):
            total+=wkmdOjb.wkmd[i+7]
        return int(total)



