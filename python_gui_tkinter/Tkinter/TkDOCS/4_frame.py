from tkinter import *
from tkinter import ttk

root = Tk()
root.geometry("500x200")

data = [ ["val1", "val2", "val3"],
         ["asd1", "asd2", "asd3"],
         ["bbb1", "bbb3", "bbb4"],
         ["ccc1", "ccc3", "ccc4"],
         ["ddd1", "ddd3", "ddd4"],
         ["eee1", "eee3", "eee4"] ]


frame = Frame(root)
frame.pack()

tree = ttk.Treeview(frame, columns = (1,2,3), height = 5, show = "headings")
tree.pack(side = 'left')

tree.heading(1, text="Column 1")
tree.heading(2, text="Column 2")
tree.heading(3, text="Column 3")

tree.column(1, width = 100)
tree.column(2, width = 100)
tree.column(3, width = 100)

scroll = ttk.Scrollbar(frame, orient="vertical", command=tree.yview)
scroll.pack(side = 'right', fill = 'y')

tree.configure(yscrollcommand=scroll.set)

for val in data:
    tree.insert('', 'end', values = (val[0], val[1], val[2]) )

root.mainloop()