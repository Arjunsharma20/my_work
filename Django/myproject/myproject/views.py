from django.http import HttpResponse
from django.shortcuts import render


# def home(request):
#     # return HttpResponse("Hello world, you are at django Home page")
#     return render(request,'myapp/''home.html')

def home(request):
    return render(request, 'myapp/home.html')  # Use app name if inside an app folder

def room(request):
    return render(request, 'myapp/room.html')




def about(request):
    return HttpResponse("Hello world, you are at django About page")

def contact(request):
    return HttpResponse("Hello world, you are at django Contact page")

