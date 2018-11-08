#!/usr/bin/python3
from tkinter import *
from tkinter import font
from tkinter.filedialog   import askopenfilename

root = Tk()
menu = Menu(root)
root.config(menu=menu)
root.geometry("1080x800+200+200")


class CommandsGUI:
	# to show the details of every possible data in the app
	def show():
		print("The content of the whole db!")

	# to change some specific contents of the database app
	def change():
		print("The content of some specific key is changed!")

	# to insert some contents in the dbapp
	def insert():
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

