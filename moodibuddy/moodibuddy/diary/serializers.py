from rest_framework import serializers
from diary.models import Diary

class DiarySerializer(serializers.ModelSerializer):

    username = serializers.SerializerMethodField()

    class Meta:
        model = Diary
        fields = (
            'username',
            'date',
            'emotion',
            'fieldA',
            'fieldB',
            'fieldC',
        )

    def get_username(self, diary):
        try: user = self.context['request'].user
        except: user = diary.user
        return user.username

    def create(self, validated_data):
        user = self.context['request'].user
        emotion = validated_data.get('emotion')
        fieldA = validated_data.get('fieldA')
        fieldB = validated_data.get('fieldB')
        fieldC = validated_data.get('fieldC', '')

        Diary.objects.create(user=user, emotion=emotion, fieldA=fieldA, fieldB=fieldB, fieldC=fieldC)

        return validated_data
