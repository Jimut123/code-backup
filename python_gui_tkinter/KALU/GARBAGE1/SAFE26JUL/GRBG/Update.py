import tkinter as tk
from tkinter import *
from tkinter import font
from tkinter.filedialog   import askopenfilename
from tkinter import ttk

from AppOperations import AppOperations as ao  
parent5 = Tk()
parent5.title("FLAT-INVENTORY   JIMSOFT (SHOW DATABASE)")
parent5.geometry("1900x1000+200+200")
frame = Frame(parent5)
frame.pack()

class Update:
	def update():
			count = []
			# count the no. of columns present in the db
			for data, num in info:
				count.append(num)
			tuple_count = tuple(count)	# contains the tuple of the total no. of columns present in the db
			#print(tuple_count)
			tree = ttk.Treeview(frame, columns = tuple_count, height = 5, show = "headings")
			tree.pack(side = 'left')
			for data, num in info:
				tree.heading(num, text = data)
				tree.column(num, width = 200)
			scroll = ttk.Scrollbar(frame, orient="vertical", command=tree.yview)
			scroll.pack(side = 'right', fill = 'y')
			tree.configure(yscrollcommand=scroll.set)

			list_db = ao.displayData()
			k_dummy = 0
			for item in list_db:
				#for item1 in item:
				tree.insert('','end',values = item)
			tree.bind('<Button-1>', Generic.selectItem)
			curItem = tree.focus()
			print (tree.item(curItem))

			'''
			for val in data:
				tree.insert('', 'end', values = (val[0], val[1], val[2]) )
			'''
	def get_selected_row(self,event):   #the "event" parameter is needed b/c we've binded this function to the listbox
        try:
            index = self.list1.curselection()[0]
            self.selected_tuple = self.list1.get(index)
            self.e1.delete(0,END)
            self.e1.insert(END,self.selected_tuple[1])
            self.e2.delete(0, END)
            self.e2.insert(END,self.selected_tuple[2])
            self.e3.delete(0, END)
            self.e3.insert(END,self.selected_tuple[3])
            self.e4.delete(0, END)
            self.e4.insert(END,self.selected_tuple[4])
        except IndexError:
            pass                #in the case where the listbox is empty, the code will not execute

mainloop()