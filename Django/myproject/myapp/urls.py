from django.urls import path
from . import views

urlpatterns = [
    path('',views.home,name='home'),
    path('room/<str:pk>/',views.room,name='room'),
    path('createroom/',views.createroom,name="Create-Room"),
    path('updateroom/<str:pk>',views.updateRoom,name="Update-Room"),
    path('deleteroom/<str:pk>',views.deleteroom,name="Delete-Room"),

]
