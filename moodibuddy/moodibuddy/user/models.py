from django.db import models
from django.contrib.auth.models import User


class UserProfile(models.Model):
    user = models.ForeignKey(User, related_name="user_profile", unique=True, on_delete=models.CASCADE)
    nickname = models.CharField(max_length=20, db_index=True, null=False)
    level = models.PositiveSmallIntegerField(null=False)
    curr = models.CharField(max_length=5)
    exp = models.SmallIntegerField(null=False)
    codeA = models.CharField(max_length=10, blank=True)
    codeB = models.CharField(max_length=10, blank=True)
    codeC = models.CharField(max_length=10, blank=True)

    # below will be implemented on v2
    # gender_type = (
    #     ('F', 'female'),
    #     ('M', 'male'),
    #     ('Q', 'nonbinary'),
    # )
    # email = models.CharField(max_length=30, null=True)
    # age = models.SmallIntegerField(null=True)
    # first_name = models.CharField(max_length=20, null=True)
    # last_name = models.CharField(max_length=20, null=True)
    # gender = models.CharField(max_length=20, choices=gender_type, db_index=True, null=True)
    # job = models.CharField(max_length=100, null=True)

class UserType(models.Model):

    grant_type = (
        ('O', 'OAUTH'),
        ('P', 'PASSWORD'),
    )
    user=models.ForeignKey(User, related_name="user_type", on_delete=models.CASCADE)
    type=models.CharField(max_length=10, choices=grant_type, blank=False)


# class UserStatus(models.Model):
#
#     level = models.PositiveSmallIntegerField(null=False)
#     curr = models.CharField(max_length=5)
#     exp = models.SmallIntegerField(null=False)
#     user = models.ForeignKey(User, related_name='user_status',unique=True, on_delete=models.CASCADE)
#
#
# class UserQuest(models.Model):
#
#     user = models.ForeignKey(User, related_name='user_quest', unique=True, on_delete=models.CASCADE)
#     codeA = models.CharField(max_length=10, blank=True)
#     codeB = models.CharField(max_length=10, blank=True)
#     codeC = models.CharField(max_length=10, blank=True)
#
#     #난수로 주고받기


