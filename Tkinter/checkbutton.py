from tkinter import *
window = Tk()
# window.bg = 
# def display():
#     if(x.get()==1):
#         print("You agreed")
#     else:
#         print("You don't agreed")
x = IntVar()    
# check_button = Checkbutton(window,text="I agreed to something",
# command = display,fg = "#00FF00",variable=x,
# bg="black",activeforeground="#00FF00",activebackground="black")
# check_button.pack()
# submit_button = Button(window,text="Submit",command=submit,fg = "#00FF00",
# bg="black",activeforeground="#00FF00",activebackground="black")
# submit_button.pack()
Checkbutton(window,text="Male",variable=x).grid(row=0,sticky=W)
y = IntVar
Checkbutton(window,text="Female",variable=y).grid(row=1,sticky=W)

window.mainloop()