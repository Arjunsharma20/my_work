from tkinter import *
count =0
def click():
    global count
    count=count+1
    print(count)
window = Tk()
# photo = PhotoImage(file = "as.png")  #initialize the image in the file
Button = Button(window,
text = "Click Me", 
command = click,
font = ("Comic Sans", 30),
fg = "#00FF00",
bg = "black",
activeforeground="#00FF00",
activebackground="black",
state = ACTIVE,
# image=photo,    #here we give the image to button
# compound='bottom'   #use to give image bottom to the text
)
Button.pack()
window.mainloop()