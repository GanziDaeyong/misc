from django.db import models
from django.contrib.auth.models import User
from django.contrib.postgres.fields import ArrayField

# Create your models here.
class WeeklyMood(models.Model):

    user = models.ForeignKey(User, related_name="user_wkmd", unique=False, on_delete=models.CASCADE)
    yearWeek = models.CharField(max_length=30, blank=False)
    wkmd = ArrayField(models.FloatField(null=False), size=14, null=True)
    avg = models.SmallIntegerField(null=True)