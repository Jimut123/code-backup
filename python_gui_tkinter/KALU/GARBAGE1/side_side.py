import tkinter as tk
from tkinter import *
# create the main sections of the layout, 
# and lay them out
root = Tk()
top = Frame(root)
bottom = Frame(root)
top.pack(side=TOP)
bottom.pack(side=BOTTOM, fill=BOTH, expand=True)

# create the widgets for the top part of the GUI,
# and lay them out
b = Button(root, text="Enter", width=10, height=2, #command=button1
	)
c = Button(root, text="Clear", width=10, height=2, #command=clear
	)
b.pack(in_=top, side=LEFT)
c.pack(in_=top, side=LEFT)

# create the widgets for the bottom part of the GUI,
# and lay them out
text = Text(root, width=35, height=15)
scrollbar = Scrollbar(root)
scrollbar.config(command=text.yview)
text.config(yscrollcommand=scrollbar.set)
scrollbar.pack(in_=bottom, side=RIGHT, fill=Y)
text.pack(in_=bottom, side=LEFT, fill=BOTH, expand=True)
mainloop()