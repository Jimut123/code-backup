from tkinter import *
from tkinter import ttk

import textwrap


def wrap(string, lenght=8):
    return '\n'.join(textwrap.wrap(string, lenght))


myApp = Tk()

NewTree = ttk.Treeview(myApp, height=5)
NewTree['show'] = 'headings'
s = ttk.Style()
s.configure('Treeview', rowheight=40)

NewTree["columns"] = ("1", "2")

NewTree.column("1", width=60)
NewTree.column("2", width=60)

NewTree.heading("1", text="col a")
NewTree.heading("2", text="col b")

item = NewTree.insert("", "end", values=(wrap("i want to wrap this text"),
                                         wrap("and this text")))

NewTree.grid(row=0, column=0)

myApp.mainloop()