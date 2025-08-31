from tkinter import *
window = Tk()
window.title("Checkbutton and Radiobutton")
Menubar = Menu(window)
filemenu = Menu(Menubar,tearoff=0)
filemenu.add_command(label = "Open")
filemenu.add_command(label ="Save")
filemenu.add_separator()
filemenu.add_command(label = "Exit", command = window.quit)
Menubar.add_cascade(label="File", menu=filemenu)


viewmenu = Menu(Menubar,tearoff=0)
show_toolbar = IntVar()
show_statusbar = IntVar()
viewmenu.add_checkbutton(label = "Show toolbar",variable = show_toolbar)
viewmenu.add_checkbutton(label = "Show Statusbar",variable = show_statusbar)
Menubar.add_cascade(label = "View",menu = viewmenu)


thememenu = Menu(Menubar,tearoff=0)
theme = StringVar()
theme.set("Light Mode")
thememenu.add_radiobutton(label = "Light Mode",variable = theme,value = "Light Mode")
thememenu.add_radiobutton(label = "Dark Mode",variable = theme,value = "Dark Mode")
Menubar.add_cascade(label = "Theme",menu = thememenu)
window.config(menu=Menubar)
window.mainloop()