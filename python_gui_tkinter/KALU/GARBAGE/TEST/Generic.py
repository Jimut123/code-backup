import tkinter as tk
from tkinter import *
from tkinter import font
from tkinter.filedialog   import askopenfilename
from tkinter import ttk
import textwrap


from AppOperations import AppOperations as ao  			# the class build for this purpose
from CommandsGUI import CommandsGUI
from CommandsGUI import ScreenGUI
#from Generic import Generic
from GUIfunctions import GUIfunctions
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


root = Tk()
menu = Menu(root)
root.config(menu=menu)
root.title("FLAT-INVENTORY   JIMSOFT")
root.geometry("1000x600+200+200")
print("Starting your application... This may take some time... hold on!")

class Generic:				# this class is used to combine multiple functions to return into 1 function
	def combine_funcs(*funcs):
		# command = combine_funcs(func1, func2)
		def combined_func(*args, **kwargs):
			for f in funcs:
				f(*args, **kwargs)
		return combined_func
	def answer():
		showerror("Answer", "Sorry, no answer available")

	def callback():
		if messagebox.askyesno('Verify', 'Really quit?'):
			if messagebox.showwarning('Save Changes?', 'Commit all existing data ?'):
				print('Changes saved!')
				ao.save_root()
			root.destroy()
		else:
			messagebox.showinfo('No', 'Quit has been cancelled')
	def delete_dummy():
		GUIfunctions.delete_multiple()

# to implement the dialogue warning stuffs on exiting
root.protocol("WM_DELETE_WINDOW",Generic.callback)

if __name__ == "__main__":
	ScreenGUI.detailsMenu()
	ScreenGUI.manipulateMenu()
	ScreenGUI.billMenu()
	mainloop()
