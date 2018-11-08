from tkinter import *

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
e=["","","","","","","","","",""]	# entries


class Page(Frame):
    """Page is the Frame that will be added/removed at will"""
    def __init__(self, root, id):
        Frame.__init__(self, root)
        Label(self, text="Frame %d" % id).pack()

class insert(Frame):
    """Main application where everything is done"""
    def __init__(self, root):
        Frame.__init__(self, root)
        self.root = root
        for data,num in info:
        	self.row = root
        	self.lab = Label(self.row, width=25, padx =10, pady = 10, text=data,font=font.Font(family='Helvetica', size=12, weight='bold'), anchor='w')
        	self.ent = Entry(self.row)
			e[num] = ent
			self.row.pack(side=TOP, fill=X, padx=5, pady=5)
			self.lab.pack(side=LEFT)
			self.ent.pack(side=RIGHT, expand=YES, fill=X)
		Button(self, text='Show'#, command=CommandsGUI.show_entry_fields
				).pack(side=LEFT, padx=5, pady=5)
		Button(self, text='Insert to database'#, command=DBOperations.insert_into_db
				).pack(side=LEFT, padx=5, pady=5)
		Button(self, text='Reset'#, command=DBOperations.reset_val
				).pack(side=RIGHT, padx=5, pady=5)
		Button(self, text="Next", command=self.next).pack(side=BOTTOM)

    def next(self):
        """changes the current page. I've only done next here, but you could
        do backwards, skip pages, etc"""
        self.pages[self.page].pack_forget() #remove the current page
        self.page += 1
        if self.page >= 5: #checking haven't gone past the end of self.page
            self.page = 0
        self.pages[self.page].pack(side=TOP) #add the next one
        
if __name__ == "__main__":
    root = Tk()
    app = insert(root)
    app.pack()
    root.mainloop()
