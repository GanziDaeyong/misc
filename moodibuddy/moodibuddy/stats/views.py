from rest_framework import status, viewsets
from rest_framework.response import Response
from rest_framework.decorators import action
from stats.models import WeeklyMood
from diary.models import Diary
from diary.serializers import DiarySerializer
from stats.serializers import StatsSerializer


class StatsViewSet(viewsets.GenericViewSet):
    serializer_class = StatsSerializer

    @action(detail=False, methods=['GET'])
    def weeklymood(self, request):
        queryset= WeeklyMood.objects.filter(user=request.user)
        serializer = self.serializer_class(queryset, many=True)
        return Response(serializer.data)

    @action(detail=False, methods=['GET'])
    def diary(self, request):
        order = request.query_params.get('order')
        date = request.query_params.get('date')

        user = request.user
        queryset= Diary.objects.filter(user=user)
        if order == 'earliest':
            queryset = queryset.order_by('id')
        elif order == 'latest':
            queryset = queryset.order_by('-id')

        if date:
            queryset= queryset.filter(date=date)
        page = self.paginate_queryset(queryset)
        serializer = DiarySerializer(page, many=True)

        return self.get_paginated_response(serializer.data)

