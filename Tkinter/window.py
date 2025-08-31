from tkinter import *

# Widgets = GUI element: buttons, textboxes, labels, images
# Windows = serves as a container to hold or contain these widgets.

window = Tk()  # instantiante an instance of a windows
window.geometry("420x420")
window.title("Arjun first GUI program")
icon = PhotoImage(file = 'as.png')
window.iconphoto(True,icon)
window.config(background="skyblue")
window.mainloop()  # palce window on computer screen, listen for events
