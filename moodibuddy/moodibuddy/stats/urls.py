from django.urls import include, path
from rest_framework.routers import SimpleRouter

from stats.views import StatsViewSet

app_name = 'stats'

router = SimpleRouter()
router.register('stats', StatsViewSet, basename='stats')

urlpatterns = [
    path('', include((router.urls))),
]