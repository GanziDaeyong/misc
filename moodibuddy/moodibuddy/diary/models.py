
from django.contrib.auth.models import User
from django.db import models

class Diary(models.Model):

    emo = ((1, 1),(2, 2),(3, 3),(4, 4),(5, 5),)
    user = models.ForeignKey(User, related_name="user_diary", unique=False, on_delete=models.CASCADE)
    date = models.DateField(auto_now_add=True, null=False)
    emotion = models.SmallIntegerField(max_length=5, choices=emo, db_index=True, null=False)
    fieldA = models.CharField(max_length=500, db_index=True, blank=False)
    fieldB = models.CharField(max_length=500, db_index=True, blank=False)
    fieldC = models.CharField(max_length=500, db_index=True, blank=True)

