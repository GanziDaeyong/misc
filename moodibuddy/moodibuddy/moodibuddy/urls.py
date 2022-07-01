from django.contrib import admin
from django.urls import include, path
from django.http import HttpResponse

def ping(request):
    return HttpResponse('무디버디에 오신 걸 환영합니다.')

urlpatterns = [
    path('', ping),
    path('admin/', admin.site.urls),
    path('api/v1/', include('user.urls')),
    path('api/v1/', include('diary.urls')),
    path('api/v1/', include('stats.urls')),
]


