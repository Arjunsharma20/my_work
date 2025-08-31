from tkinter import *
window = Tk()
def display():
    print("Selected Value:",x.get())
x = IntVar()
scale_value = Scale(window,from_=0,to=100,variable=x,resolution=5,tickinterval=10,length=300)
scale_value.pack()
btn = Button(window,text="Get Value",command=display)
btn.pack()
window.mainloop()