#!/usr/bin/python
 
from tkinter import *
from tkinter import ttk
import tkinter as tk
 
main = Tk()
main.title('Notebook Demo')
main.geometry('500x500')
 
 
# gives weight to the cells in the grid
rows = 0
while rows < 50:
    main.rowconfigure(rows, weight=1)
    main.columnconfigure(rows, weight=1)
    rows += 1
 
# Defines and places the notebook widget
nb = ttk.Notebook(main)
nb.grid(row=1, column=0, columnspan=50, rowspan=49, sticky='NESW')
 
# Adds tab 1 of the notebook
page1 = ttk.Frame(nb)
nb.add(page1, text='Tab1')
Button(page1, justify=tk.LEFT, padx =10, pady = 10, 
			text='show data'#, command=CommandsGUI.show_entry_fields
			).grid(row=20, column=1, sticky=W, pady=4)
Button(page1, justify=tk.LEFT, padx =10, pady = 10, 
			text='Insert to database'#, command=DBOperations.insert_into_db
			).grid(row=20, column=2, sticky=W, pady=4)
Button(page1, justify=tk.LEFT, padx =10, pady = 10, 
			text='reset'#, command=DBOperations.reset_val
			).grid(row=20, column=3, sticky=W, pady=4)

# Adds tab 2 of the notebook
page2 = ttk.Frame(nb)
nb.add(page2, text='Tab2')
 
 
main.mainloop()