from tkinter import *
window = Tk()  # instantiante an instance of a windows
window.geometry("420x420")
window.title("Arjun first GUI program")
icon = PhotoImage(file = 'as.png')
window.iconphoto(True,icon)
label = Label(window,
text="Hello World",
font = ('Arial',20,'bold'),
fg = 'green',bg='black')
# label.place(x = 40,y = 0  )
label.pack()

window.config(background="skyblue")
window.mainloop()  # palce window on computer screen, listen for events
