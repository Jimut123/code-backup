import tkinter as tk
from tkinter import *
from tkinter import font
from tkinter.filedialog   import askopenfilename
from tkinter import ttk
import textwrap
from AppOperations import AppOperations as ao  			# the class build for this purpose
#from tkMessageBox import *
from tkinter import messagebox


def wrap(string, lenght=30):
			return '\n'.join(textwrap.wrap(string, lenght))
parent7 = Tk()
parent7.title("FLAT-INVENTORY   JIMSOFT (DELETION MODE)")
parent7.geometry("1900x1000+200+200")


count_total = ao.countTotalItems()
list_db = ao.displayData()

var = []
row_no = 0
i = 0
for i in range(count_total):
    var.append(IntVar())
dumy = 0

for item in list_db:
	print(item)
	values_t = [] 
	k = 0
	for items in item:
		#print(items)
		values_t.insert(k,wrap(str(items)))
		k=k+1
	#tuple_A = tuple(values_t)
	print(values_t)
	str_val = ""
	for item in values_t:
		str_val = str_val + item+"  "
	Checkbutton(parent7, text=str_val, variable=var[dumy]).grid(row=row_no, sticky=W)
	row_no = row_no + 1
	dumy = dumy + 1
	#print("#############",str_val)
print("Loop exited")
def show_selected():
	itera = 0
	print("Total count : ",count_total)
	for itera in range(count_total):
		print("Checkbox :::: ",var[itera].get())
		print(itera)
		itera = itera + 1
Button(parent7, text='show selected', command=show_selected).grid(row=row_no+1, column=2, sticky=W, pady=4)

mainloop()