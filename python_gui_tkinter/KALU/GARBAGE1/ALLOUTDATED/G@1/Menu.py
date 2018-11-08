from tkinter import *
from tkinter import font
from tkinter.filedialog   import askopenfilename

def show():
    print("The content of the whole db!")
def change():
	print("The content of some specific key is changed!")
def insert():
	print("Insert the contents!")
def remove():
	print("Insert some specific contents!")
def calculate_bill():
	print("To calculate the bill!")
def OpenFile():
    name = askopenfilename()
    print (name)
def About():
    print("This is a simple example of a menu")

root = Tk()
menu = Menu(root)
root.config(menu=menu)
root.geometry("1080x800+200+200")
detailsmenu = Menu(menu)
menu.add_cascade(label="Details", menu=detailsmenu,font=font.Font(family='Helvetica', size=12, weight='bold'))
detailsmenu.add_command(label="Show", command=show,font=font.Font(family='Helvetica', size=12, weight='bold'))

#filemenu.add_command(label="Open...", command=OpenFile,font=font.Font(family='Helvetica', size=12, weight='bold'))
#filemenu.add_separator()
#filemenu.add_command(label="Exit", command=root.quit,font=font.Font(family='Helvetica', size=12, weight='bold'))

manipulatemenu = Menu(menu)
menu.add_cascade(label="Manipulate", menu=manipulatemenu,font=font.Font(family='Helvetica', size=12, weight='bold'))
manipulatemenu.add_command(label="change", command=change,font=font.Font(family='Helvetica', size=12, weight='bold'))
manipulatemenu.add_command(label="insert", command=insert,font=font.Font(family='Helvetica', size=12, weight='bold'))
manipulatemenu.add_command(label="remove", command=remove,font=font.Font(family='Helvetica', size=12, weight='bold'))


billmenu = Menu(menu)
menu.add_cascade(label="Bills", menu=billmenu,font=font.Font(family='Helvetica', size=12, weight='bold'))
billmenu.add_command(label="calculate", command=calculate_bill,font=font.Font(family='Helvetica', size=12, weight='bold'))


#menu.add_cascade(label="Help", menu=helpmenu,font=font.Font(family='Helvetica', size=12, weight='bold'))
#helpmenu.add_command(label="About...", command=About,font=font.Font(family='Helvetica', size=12, weight='bold'))

mainloop()