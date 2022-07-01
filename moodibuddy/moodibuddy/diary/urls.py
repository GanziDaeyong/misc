from django.urls import include, path
from rest_framework.routers import SimpleRouter

from diary.views import DiaryViewSet

app_name = 'diary'

router = SimpleRouter()
router.register('diary', DiaryViewSet, basename='diary')

urlpatterns = [
    path('', include((router.urls))),
]