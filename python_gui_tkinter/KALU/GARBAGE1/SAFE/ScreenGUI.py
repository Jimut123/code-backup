import tkinter as tk
from tkinter import *
from tkinter import font
from tkinter.filedialog   import askopenfilename
from tkinter import ttk

from AppOperations import AppOperations as ao  			# the class build for this purpose

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


root = Tk()
menu = Menu(root)
root.config(menu=menu)
root.title("FLAT-INVENTORY   JIMSOFT")
root.geometry("1080x800+200+200")

print("Starting your application... This may take some time... hold on!")

class GUIfunctions:
	def insert():
		data_valid = 0		# everytime it is set to 0, on clscreen
		row_no = 1	# row number
		for data, num in info:
			#print(data,"\t",num)
			tk.Label(root, justify=tk.LEFT, padx =10, pady = 10, 
						text=data,font=font.Font(family='Helvetica', size=12, 
						weight='bold')).grid(row=row_no,column=1,sticky=W, pady=4)
			e[num] = tk.Entry(root)
			e[num].grid(row=row_no, column=2,sticky=W, pady=4)
			row_no = row_no + 2

		Button(root, justify=tk.LEFT, padx =10, pady = 10, 
					text='show data', command=CommandsGUI.show_entry_fields).grid(row=20, 
					column=1, sticky=W, pady=4)
		Button(root, justify=tk.LEFT, padx =10, pady = 10, 
					text='Insert to database', command=DBOperations.insert_into_db).grid(row=20, 
					column=2, sticky=W, pady=4)
		Button(root, justify=tk.LEFT, padx =10, pady = 10, 
					text='reset', command=DBOperations.reset_val).grid(row=20, 
					column=3, sticky=W, pady=4)
	def show():
		frame = Frame(root)
		frame.pack()
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
			tree.column(num, width = 210)
		scroll = ttk.Scrollbar(frame, orient="vertical", command=tree.yview)
		scroll.pack(side = 'right', fill = 'y')
		tree.configure(yscrollcommand=scroll.set)

		list_db = ao.displayData()

		for item in list_db:
			#for item1 in item:
			tree.insert('','end', values = item)
		'''
		for val in data:
    		tree.insert('', 'end', values = (val[0], val[1], val[2]) )
    	'''

class DBOperations:
	def reset_val():
		# to reset all the values that is entered in the form
		print("Reseting values.")
		row_no = 28
		for i in range(20):
			text = "                                                                                             "
			tk.Label(root, justify=tk.LEFT, padx =10,  pady = 10, 
						text=text,font=font.Font(family='Helvetica', 
						size=12, weight='bold')).grid(row=row_no,column=1, sticky=W, pady=4)
			row_no = row_no+2
		GUIfunctions.insert()
	
	def insert_into_db():
		print("Inserting data in the db!")
		i_name = e[1].get()
		i_e_mail =  e[2].get()
		i_flat =  e[3].get()
		i_tower = e[4].get()
		i_area =  e[5].get()
		i_parking =  e[6].get()
		i_recpt_fees = e[7].get()
		i_addr =  e[8].get()
		i_contact_no = e[9].get()
		print(i_name," ", i_e_mail," ", i_tower," ", i_flat," ", i_area," ", i_parking," ", i_recpt_fees," ", i_addr," ", i_contact_no)
		# turns 1 if the data was entered sucessfully else it turns 0
		global data_valid
		data_valid = ao.insertData(i_name, i_e_mail, i_tower, i_flat, i_area, 
								i_parking, i_recpt_fees, i_addr, i_contact_no)
		print("VALIDATED ? :",data_valid)
		DataValidation.data_wrong()
class DataValidation:
	def data_wrong():
		row_no = 50
		#global data_valid
		if data_valid == 1:
			text = "Data entered sucessfully"
			tk.Label(root, justify=tk.LEFT, padx =10,  pady = 10, 
						text=text,font=font.Font(family='Helvetica', 
						size=12, weight='bold')).grid(row=row_no,column=1, sticky=W, pady=4)
		elif data_valid == 0:
			text = "Ops!! Data couldn't be entered sucessfully"
			tk.Label(root, justify=tk.LEFT, padx =10,  pady = 10, 
						text=text,font=font.Font(family='Helvetica', 
						size=12, weight='bold')).grid(row=row_no,column=1, sticky=W, pady=4)
class CommandsGUI:
	# to show the details of every possible data in the app
	def show_entry_fields():
		# For printing the values in the terminal
		row_no = 28
		text = "The values entered :"
		tk.Label(root, justify=tk.LEFT, padx =10,  pady = 10, 
					text=text,font=font.Font(family='Helvetica', 
					size=12, weight='bold')).grid(row=row_no,column=1, sticky=W, pady=4)
		row_no = row_no + 2

		for data, num in info:
			text = ""
			text = "{:<25s}{:>25s}".format(data, e[num].get())
			tk.Label(root, justify=tk.LEFT, padx =10,  pady = 10, 
						text=text,font=font.Font(family='Helvetica', 
						size=12, weight='bold')).grid(row=row_no,column=1, sticky=W, pady=4)
			row_no = row_no+2
		#DataValidation.data_wrong()
	def show():
		GUIfunctions.show()
		print("The content of the whole db!")

	# to change some specific contents of the database app
	def change():
		print("The content of some specific key is changed!")

	# to insert some contents in the dbapp
	def insert():
		GUIfunctions.insert()
		print("Insert the contents!")

	# to remove some specific contents from the app
	def remove():
		print("Insert some specific contents!")

	# to calculate the bill from the menu
	def calculate_bill():
		print("To calculate the bill!")

	### Not needed till now!
	def OpenFile():
	    name = askopenfilename()
	    print (name)
	def About():
	    print("This is a simple example of a menu")

class ScreenGUI:
	# the details menu of the first tab
	def detailsMenu():
		detailsmenu = Menu(menu)
		menu.add_cascade(label="Details", menu=detailsmenu,font=font.Font(family='Helvetica', size=12, weight='bold'))
		# acessing the show method from CommandsGUI as CommandsGUI.show
		detailsmenu.add_command(label="Show", command=CommandsGUI.show,font=font.Font(family='Helvetica', size=12, weight='bold'))

	# the manipulate menu
	def manipulateMenu():
		manipulatemenu = Menu(menu)
		menu.add_cascade(label="Manipulate", menu=manipulatemenu,font=font.Font(family='Helvetica', size=12, weight='bold'))
		# sub commands in the menu, calling the function
		manipulatemenu.add_command(label="change", command=CommandsGUI.change,font=font.Font(family='Helvetica', size=12, weight='bold'))
		manipulatemenu.add_command(label="insert", command=CommandsGUI.insert,font=font.Font(family='Helvetica', size=12, weight='bold'))
		manipulatemenu.add_command(label="remove", command=CommandsGUI.remove,font=font.Font(family='Helvetica', size=12, weight='bold'))

	# the bill menu
	def billMenu():
		billmenu = Menu(menu)
		menu.add_cascade(label="Bills", menu=billmenu,font=font.Font(family='Helvetica', size=12, weight='bold'))
		billmenu.add_command(label="calculate", command=CommandsGUI.calculate_bill,font=font.Font(family='Helvetica', size=12, weight='bold'))

if __name__ == "__main__":
	ScreenGUI.detailsMenu()
	ScreenGUI.manipulateMenu()
	ScreenGUI.billMenu()
	mainloop()

