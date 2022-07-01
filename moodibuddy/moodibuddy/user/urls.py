from django.urls import include, path
from rest_framework.routers import SimpleRouter

from user.views import UserViewSet, UserProfileViewSet, EmailViewSet, DuplicateCheckViewSet, MainPageViewSet

app_name = 'user'

router = SimpleRouter()
router.register('user', UserViewSet, basename='user')  # /api/v1/user/
router.register('userprofile', UserProfileViewSet, basename='userprofile')
router.register('email', EmailViewSet, basename='email')
router.register('duplicate', DuplicateCheckViewSet, basename='duplicate')
router.register('main', MainPageViewSet, basename='main')
urlpatterns = [
    path('', include((router.urls))),
]