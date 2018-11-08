'''
What about deleting the input of an Entry object, every time, we are showing the content in our function show_entry_fields()? No problem! We can use the delete method. The delete() method has the format delete(first, last=None). If only one number is given, it deletes the character at index. If two are given, the range from "first" to "last" will be deleted. Use delete(0, END) to delete all text in the widget. 
'''

from tkinter import *

def show_entry_fields():
   print("First Name: %s\nLast Name: %s" % (e1.get(), e2.get()))
   e1.delete(0,END)
   e2.delete(0,END)

master = Tk()
Label(master, text="First Name").grid(row=0)
Label(master, text="Last Name").grid(row=1)

e1 = Entry(master)
e2 = Entry(master)
e1.insert(10,"Miller")
e2.insert(10,"Jill")

e1.grid(row=0, column=1)
e2.grid(row=1, column=1)

Button(master, text='Quit', command=master.quit).grid(row=3, column=0, sticky=W, pady=4)
Button(master, text='Show', command=show_entry_fields).grid(row=3, column=1, sticky=W, pady=4)

mainloop( )

