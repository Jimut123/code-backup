import tkinter as tk
from tkinter import *
from tkinter import font
from tkinter.filedialog   import askopenfilename
from tkinter import ttk
import textwrap

from AppOperations import AppOperations as ao  			# the class build for this purpose
from CommandsGUI import CommandsGUI
from Generic import Generic
from GUIfunctions import GUIfunctions
#from DBOperations import DBOperations


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

class DBOperations:
	def reset_val():
		# to reset all the values that is entered in the form
		print("Reseting values.")
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
		row_no = 0
		parent3 = Tk()
		row = Frame(parent3)
		parent3.title("FLAT-INVENTORY   JIMSOFT ( INSERTED ? )")
		parent3.geometry("500x50+200+200")
		#global data_valid
		if data_valid == 1:
			text = "Data entered sucessfully"
			tk.Label(parent3, justify=tk.LEFT, padx =10,  pady = 10, 
						text=text,font=font.Font(family='Helvetica', 
						size=12, weight='bold')).grid(row=row_no,column=1, sticky=W, pady=4)
		elif data_valid == 0:
			text = "Ops!! Data couldn't be entered sucessfully"
			tk.Label(parent3, justify=tk.LEFT, padx =10,  pady = 10, 
						text=text,font=font.Font(family='Helvetica', 
						size=12, weight='bold')).grid(row=row_no,column=1, sticky=W, pady=4)

	def update_rows(tuple_rows):
		def get_rows():
			i_sl_no = data_col[1]
			i_name = e[1].get()
			i_e_mail =  e[2].get()
			i_flat =  e[3].get()
			i_tower = e[4].get()
			i_area =  e[5].get()
			i_parking =  e[6].get()
			i_recpt_fees = e[7].get()
			i_addr =  e[8].get()
			i_contact_no = e[9].get()
			i_tmstmp = data_col[11]
			#print(i_sl_no," ",i_name," ", i_e_mail," ", i_flat," ", i_tower," ", i_area," ", i_parking," ", i_recpt_fees," ", i_addr," ", i_contact_no," ",i_tmstmp)
			ao.updateData(i_sl_no, i_name, i_e_mail, i_flat, i_tower, i_area, i_parking, 
				i_recpt_fees, i_addr, i_contact_no, i_tmstmp)
		def data_updated_sucessfully():
			row_no = 0
			parent3 = Tk()
			row = Frame(parent3)
			parent3.title("FLAT-INVENTORY   JIMSOFT ( UPDATED ? )")
			parent3.geometry("500x50+200+200")
			#global data_valid
			text = "Data updated sucessfully"
			tk.Label(parent3, justify=tk.LEFT, padx =10,  pady = 10, 
						text=text,font=font.Font(family='Helvetica', 
						size=12, weight='bold')).grid(row=row_no,column=1, sticky=W, pady=4)
		data_valid = 0		# everytime it is set to 0, on clscreen
		row_no = 1	# row number
		parent6 = Tk()
		parent6.title("FLAT-INVENTORY   JIMSOFT (UPDATE ROWS MODE)")
		parent6.geometry("800x800+200+200")
		data_col= [""]
		for data in tuple_rows:
			data_col.append(data)
		print(data_col)
		
		for data, num in info:
			#print(data,"\t",num)
			tk.Label(parent6, justify=tk.LEFT, padx =10, pady = 10, 
						text=data,font=font.Font(family='Helvetica', size=20, 
						weight='bold')).grid(row=row_no,column=1,sticky=W, pady=4)
			e[num] = tk.Entry(parent6,width = 100)
			e[num].insert(END, data_col[num+1])	# to insert an existing data
			#print("####",e[num])
			e[num].grid(row=row_no, column=2,sticky=W, pady=4)
			row_no = row_no + 2

		Button(parent6, justify=tk.LEFT, padx =10, pady = 10, 
					text='update data', command=Generic.combine_funcs(get_rows,data_updated_sucessfully)).grid(row=20, column=1, sticky=W, pady=4)
		Button(parent6, justify=tk.LEFT, padx =10, pady = 10, 
					text='show', command=GUIfunctions.update).grid(row=20, column=2, sticky=W, pady=4)
