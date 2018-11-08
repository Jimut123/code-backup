from tkinter import *

root = Tk()
v = StringVar(root, value='default text')
e = Entry(root, textvariable=v)
e.pack()
root.mainloop()
