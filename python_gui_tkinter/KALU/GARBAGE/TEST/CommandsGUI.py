
import tkinter as tk
from tkinter import *
from tkinter import font
from tkinter.filedialog   import askopenfilename
from tkinter import ttk
import textwrap

from AppOperations import AppOperations as ao  			# the class build for this purpose
#from CommandsGUI import CommandsGUI
from Generic import Generic
from GUIfunctions import GUIfunctions
from DBOperations import DBOperations

#from tkMessageBox import *
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



class CommandsGUI:
	# to show the details of every possible data in the app
	def show_entry_fields():
		# For printing the values in the terminal
		row_no = 0
		parent4 = Tk()
		parent4.title("FLAT-INVENTORY   JIMSOFT (SHOW ENTERED VALUES)")
		parent4.geometry("900x600+200+200")
		text = "The values entered :"
		tk.Label(parent4, justify=tk.LEFT, padx =10,  pady = 10, 
					text=text,font=font.Font(family='Helvetica', 
					size=12, weight='bold')).grid(row=row_no,column=1, sticky=W, pady=4)
		row_no = row_no + 2

		for data, num in info:
			text = ""
			text = "{:<25s}{:>25s}".format(data, e[num].get())
			tk.Label(parent4, justify=tk.LEFT, padx =10,  pady = 10, 
						text=text,font=font.Font(family='Helvetica', 
						size=12, weight='bold')).grid(row=row_no,column=1, sticky=W, pady=4)
			row_no = row_no+2
		#DataValidation.data_wrong()
	def show():
		GUIfunctions.show()
		print("The content of the whole db!")

	# to change some specific contents of the database app
	def change():
		GUIfunctions.update()
		print("The content of some specific key is changed!")

	# to insert some contents in the dbapp
	def insert():
		GUIfunctions.insert()
		print("Insert the contents!")

	# to remove some specific contents from the app
	def remove():
		GUIfunctions.delete_multiple()
		print("Delete multiple contents!")

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
		menu.add_cascade(label="Details", menu=detailsmenu,font=font.Font(family='Helvetica', size=18, weight='bold'))
		# acessing the show method from CommandsGUI as CommandsGUI.show
		detailsmenu.add_command(label="Show", command=CommandsGUI.show,font=font.Font(family='Helvetica', size=17, weight='bold'))

	# the manipulate menu
	def manipulateMenu():
		manipulatemenu = Menu(menu)
		menu.add_cascade(label="Manipulate", menu=manipulatemenu,font=font.Font(family='Helvetica', size=18, weight='bold'))
		# sub commands in the menu, calling the function
		manipulatemenu.add_command(label="change", command=CommandsGUI.change,font=font.Font(family='Helvetica', size=17, weight='bold'))
		manipulatemenu.add_command(label="insert", command=CommandsGUI.insert,font=font.Font(family='Helvetica', size=17, weight='bold'))
		manipulatemenu.add_command(label="remove", command=CommandsGUI.remove,font=font.Font(family='Helvetica', size=17, weight='bold'))

	# the bill menu
	def billMenu():
		billmenu = Menu(menu)
		menu.add_cascade(label="Bills", menu=billmenu,font=font.Font(family='Helvetica', size=18, weight='bold'))
		billmenu.add_command(label="calculate", command=CommandsGUI.calculate_bill,font=font.Font(family='Helvetica', size=17, weight='bold'))
