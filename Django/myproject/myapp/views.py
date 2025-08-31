from django.shortcuts import get_object_or_404, redirect, render
from .models import Room
from django.http import HttpResponse
from .forms import RoomForm
# Create your views here.

# rooms = [
#     {'id':1,'name':'lets learn python'},
#     {'id':2,'name':'Design with me'},
#     {'id':3,'name':'Frint end developer'},
# ]


def home(request):
    rooms = Room.objects.all()
    content = {'rooms':rooms}
    return render(request, 'myapp/home.html',content)  # Use app name if inside an app folder

def room(request, pk):
    room = get_object_or_404(Room, id=pk)
    context = {'room': room}
    return render(request, 'myapp/room.html', context)
    # return render(request, 'myapp/room.html', {'rooms': rooms})

def createroom(request):
    form = RoomForm()
    if request.method== 'POST':
        form = RoomForm(request.POST)
        if form.is_valid():
            form.save()
            return redirect('home')
    context ={'form':form}
    return render(request,'myapp/room_form.html',context)

def updateRoom(request,pk):
    room = Room.objects.get(id=pk)
    form =RoomForm(instance=room)
    if request.method=='POST':
        form = RoomForm(request.POST,instance=room)
        if form.is_valid():
            form.save()
            return redirect('home')
    context = {'form':form}
    return render(request,'myapp/room_form.html',context)

def deleteroom(request, pk):
    room = Room.objects.get(id=pk)
    if request.method == 'POST':
        room.delete()
        return redirect('home')
    return render(request, 'myapp/delete.html', {'obj': room})

