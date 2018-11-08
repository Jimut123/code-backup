import sqlite3
from tkinter import *
from tkinter import font
from tkinter.filedialog   import askopenfilename

# making the connection
conn = sqlite3.connect("appDb.sqlite")
cur = conn.cursor()

# email address is the primary key
cur.executescript('''

CREATE TABLE IF NOT EXISTS details(
	sl_no INTEGER PRIMARY KEY UNIQUE NULL,
	name TEXT,
	e_mail TEXT,
	flat TEXT,
	tower TEXT,
	area INTEGER,
	parking TEXT,
	recpt_fees INTEGER,
	addr TEXT,
	contact_no TEXT

);

''')
total_record = 0
class Rec:
	def countTotalRec():
		cur.execute('''SELECT count( * ) as  total_record FROM details''')
		total_record = cur.fetchone()[0]
		print("Total data present : ",total_record)
		return total_record

class AppOperations:
	def insertData(name, e_mail, tower, flat, area, parking, recpt_fees, addr, contact_no):
		try :
			cur.execute('''INSERT  
					   INTO details (sl_no, name, e_mail, tower, flat, area, parking, recpt_fees, addr, contact_no)
                       VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )''', 
                       ( (Rec.countTotalRec()+1),name,tower,e_mail,flat,area,parking,recpt_fees,addr,contact_no,))
			conn.commit()
			return 1
		except:
			print("Ops! something went wrong during insertion of the data!!")
			return 0
		return 1

	def displayData():				# returns all the data present in the db, list of tuples
		data_fetch = cur.execute(''' SELECT * FROM details ''')
		list_db = []
		for item in data_fetch:
			list_db.append(item)
		#print(list_db)
		return list_db

	def countTotalItems():
		total_items = 0			# contains the total no. of items present in the table
		data_fetch = cur.execute(''' SELECT * FROM details ''')
		for item in data_fetch:
			total_items = total_items + 1
		return total_items
