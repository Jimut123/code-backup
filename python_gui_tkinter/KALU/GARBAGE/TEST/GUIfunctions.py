import tkinter as tk
from tkinter import *
from tkinter import font
from tkinter.filedialog   import askopenfilename
from tkinter import ttk
import textwrap


from AppOperations import AppOperations as ao  			# the class build for this purpose
from CommandsGUI import CommandsGUI
from Generic import Generic
#from GUIfunctions import GUIfunctions
from DBOperations import DBOperations


from tkinter import messagebox
# last parent5

data_valid = 0	# to check if the data was sucessfully inserted or not!

info = [
		("Name (TEXT):",1),
		("e-mail (TEXT):",2),
		("Flat no. (TEXT):",3),
		("Tower no. (TEXT):",4),
		("Area (NUMBER):",5),
		("Parking (TEXT):",6),
		("Recpt. Fess (NUMBER):",7),
		("Address (TEXT):",8),
		("Contact number (TEXT):",9)
		]
e=["","","","","","","","","",""]

class GUIfunctions:
	def insert():
		data_valid = 0		# everytime it is set to 0, on clscreen
		row_no = 1	# row number
		parent1 = Tk()
		parent1.title("FLAT-INVENTORY   JIMSOFT (INSERT MODE)")
		parent1.geometry("1200x600+200+200")
		for data, num in info:
			#print(data,"\t",num)
			tk.Label(parent1, justify=tk.LEFT, padx =10, pady = 10, 
						text=data,font=font.Font(family='Helvetica', size=20, 
						weight='bold')).grid(row=row_no,column=1,sticky=W, pady=4)
			e[num] = tk.Entry(parent1,width = 100)
			e[num].grid(row=row_no, column=2,sticky=W, pady=4)
			row_no = row_no + 2

		Button(parent1, justify=tk.LEFT, padx =10, pady = 10, 
					text='show data', command=CommandsGUI.show_entry_fields).grid(row=20, 
					column=1, sticky=W, pady=4)
		Button(parent1, justify=tk.LEFT, padx =10, pady = 10, 
					text='Insert to database', command=DBOperations.insert_into_db).grid(row=20, 
					column=2, sticky=W, pady=4)
		Button(parent1, justify=tk.LEFT, padx =10, pady = 10, 
					text='reset', command=DBOperations.reset_val).grid(row=20, 
					column=3, sticky=W, pady=4)


	def show():
		def wrap(string, lenght=30):
			return '\n'.join(textwrap.wrap(string, lenght))

		parent2 = Tk()
		parent2.title("FLAT-INVENTORY   JIMSOFT (SHOW DATABASE)")
		parent2.geometry("1900x1000+200+200")
		frame = Frame(parent2)
		frame.pack()
		count = ['sl_no']
		# count the no. of columns present in the db
		count = [0]		# the first one, sl_no
		for data, num in info:
			count.append(num)
		count.append(10)	# time stamp
		print(count)
		tuple_count = tuple(count)	# contains the tuple of the total no. of columns present in the db
		#print(tuple_count)

		tree = ttk.Treeview(frame, columns = tuple_count, height = 30, show = "headings")
		tree.pack(side = 'left')
		tree.heading(0, text = "sl_no")
		tree.column(0, width = 70)			# sl no. width
		for data, num in info:
			if num == 1 or num == 2:
				width_tree = 200
			if num == 8:
				width_tree = 300
			if num in(3,4,5,6,7):
				width_tree = 130
			if num == 9:
				width_tree = 140
			num_i = data.find('(')
			tree.heading(num, text = data[:num_i])
			tree.column(num, width = width_tree)
		tree.heading(10, text = "time stamp")
		tree.column(10, width = 200)
		scroll = ttk.Scrollbar(frame, orient="vertical", command=tree.yview)
		scroll.pack(side = 'right', fill = 'y')
		tree.configure(yscrollcommand=scroll.set)

		list_db = ao.displayData()

		for item in list_db:
			print(item)
			values_t = [] 
			k = 0
			for items in item:
				#print(items)
				values_t.insert(k,wrap(str(items)))
				k=k+1
			tuple_A = tuple(values_t)
			tree.insert('','end', values = tuple_A)


	def update():
		def selectItem(a):
			curItem = tree.focus()
			dict_tree = tree.item(curItem)	# dictionary of the tree
			values_reqd = dict_tree['values']	# a list of the values
			#print(values_reqd)
			date_collected = values_reqd[10]	# date that is collected
			#print(date_collected)
			ao.update_values(date_collected)
			#return date_collected
			row_tup = ao.update_values(date_collected)
			print("tuple needed!",row_tup)
			DataValidation.update_rows(row_tup)

		def wrap(string, lenght=30):
			return '\n'.join(textwrap.wrap(string, lenght))

		parent2 = Tk()
		parent2.title("FLAT-INVENTORY   JIMSOFT (SHOW DATABASE)")
		parent2.geometry("1900x1000+200+200")
		frame = Frame(parent2)
		frame.pack()
		count = ['sl_no']
		# count the no. of columns present in the db
		count = [0]		# the first one, sl_no
		for data, num in info:
			count.append(num)
		count.append(10)	# time stamp
		print(count)
		tuple_count = tuple(count)	# contains the tuple of the total no. of columns present in the db
		#print(tuple_count)

		tree = ttk.Treeview(frame, columns = tuple_count, height = 30, show = "headings")
		tree.pack(side = 'left')
		tree.heading(0, text = "sl_no")
		tree.column(0, width = 70)			# sl no. width
		for data, num in info:
			if num == 1 or num == 2:
				width_tree = 200
			if num == 8:
				width_tree = 300
			if num in(3,4,5,6,7):
				width_tree = 130
			if num == 9:
				width_tree = 140
			num_i = data.find('(')
			tree.heading(num, text = data[:num_i])
			tree.column(num, width = width_tree)
		tree.heading(10, text = "time stamp")
		tree.column(10, width = 200)
		scroll = ttk.Scrollbar(frame, orient="vertical", command=tree.yview)
		scroll.pack(side = 'right', fill = 'y')
		tree.configure(yscrollcommand=scroll.set)

		list_db = ao.displayData()

		for item in list_db:
			print(item)
			values_t = [] 
			k = 0
			for items in item:
				#print(items)
				values_t.insert(k,wrap(str(items)))
				k=k+1
			tuple_A = tuple(values_t)
			tree.insert('','end', values = tuple_A)
		key = tree.bind('<Double-1>', selectItem)	# on double click only

	def delete_multiple():
		def selectItem(a):
			if messagebox.askyesno('delete', 'delete selected column?'):
				if messagebox.showwarning('Sure to delete?', 'deleting selected data'):
					curItem = tree.focus()
					dict_tree = tree.item(curItem)	# dictionary of the tree
					values_reqd = dict_tree['values']	# a list of the values
					#print(values_reqd)
					#print(date_collected)
					slno = values_reqd[0]
					name = values_reqd[1]
					e_mail = values_reqd[2]
					flat = values_reqd[3]
					tower = values_reqd[4]
					area = values_reqd[5]
					parking = values_reqd[6]
					recpt_fees = values_reqd[7]
					addr = values_reqd[8]
					contact_no = values_reqd[9]
					tmestmp = values_reqd[10]
					print("Deleting : ",slno,name, e_mail, flat, tower,  area, parking, recpt_fees, addr, contact_no,tmestmp)
					ao.delete_selected(slno,name, e_mail, flat, tower,  area, parking, recpt_fees, addr, contact_no,tmestmp)
					print("deleting selected column!")
					if messagebox.askyesno('show', 'show changed values? or delete again?'):
						GUIfunctions.show()
					else:
						print("Calling self! delete function again!")
						Generic.delete_dummy()
						#messagebox.showinfo('Note', 'Open -> Details -> show to see the updated values')
			else:
				messagebox.showinfo('No', 'Deletion has been cancelled!')
		def wrap(string, lenght=30):
			return '\n'.join(textwrap.wrap(string, lenght))

		parent2 = Tk()
		parent2.title("FLAT-INVENTORY   JIMSOFT (DELETION MODE)")
		parent2.geometry("1900x1000+200+200")
		frame = Frame(parent2)
		frame.pack()
		count = ['sl_no']
		# count the no. of columns present in the db
		count = [0]		# the first one, sl_no
		for data, num in info:
			count.append(num)
		count.append(10)	# time stamp
		print(count)
		tuple_count = tuple(count)	# contains the tuple of the total no. of columns present in the db
		#print(tuple_count)

		tree = ttk.Treeview(frame, columns = tuple_count, height = 30, show = "headings")
		tree.pack(side = 'left')
		tree.heading(0, text = "sl_no")
		tree.column(0, width = 70)			# sl no. width
		for data, num in info:
			if num == 1 or num == 2:
				width_tree = 200
			if num == 8:
				width_tree = 300
			if num in(3,4,5,6,7):
				width_tree = 130
			if num == 9:
				width_tree = 140
			num_i = data.find('(')
			tree.heading(num, text = data[:num_i])
			tree.column(num, width = width_tree)
		tree.heading(10, text = "time stamp")
		tree.column(10, width = 200)
		scroll = ttk.Scrollbar(frame, orient="vertical", command=tree.yview)
		scroll.pack(side = 'right', fill = 'y')
		tree.configure(yscrollcommand=scroll.set)

		list_db = ao.displayData()

		for item in list_db:
			print(item)
			values_t = [] 
			k = 0
			for items in item:
				#print(items)
				values_t.insert(k,wrap(str(items)))
				k=k+1
			tuple_A = tuple(values_t)
			tree.insert('','end', values = tuple_A)
		key = tree.bind('<Double-1>', selectItem)	# on double click only
