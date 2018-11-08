import tkinter as tk
from tkinter import *
from tkinter import font
from tkinter.filedialog   import askopenfilename
from tkinter import ttk

from AppOperations import AppOperations as ao           # the class build for this purpose

data_valid = 0  # to check if the data was sucessfully inserted or not!

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
e=["","","","","","","","","",""]   # entries


import tkinter as tk
LARGE_FONT = ("Verdana", 12) # font's family is Verdana, font's size is 12 
 
class MainWindow(tk.Tk):
    def __init__(self, *args, **kwargs):
        tk.Tk.__init__(self, *args, **kwargs)
        self.title("DB JIM SYS") # set the title of the main window
        self.geometry("1200x1200") # set size of the main window to 300x300 pixels
 
        # this container contains all the pages
        container = tk.Frame(self)
        container.pack(side="top", fill="both", expand=True)
        container.grid_rowconfigure(0, weight=1)   # make the cell in grid cover the entire window
        container.grid_columnconfigure(0,weight=1) # make the cell in grid cover the entire window
        self.frames = {} # these are pages we want to navigate to
 
        for F in (Insert, Show): # for each page
            frame = F(container, self) # create the page
            self.frames[F] = frame  # store into frames
            frame.grid(row=0, column=0, sticky="nsew") # grid it to container
 
        self.show_frame(Insert) # let the first page is Insert
 
    def show_frame(self, name):
        frame = self.frames[name]
        frame.tkraise()
 
class Insert(tk.Frame):
    def __init__(self, parent, controller):
        #tk.Frame.__init__(self, parent)
        for data,num in info:
            tk.Frame.__init__(self, parent)
            #               width = width of the descrp. label
            lab = Label(self, width=25, padx =10, pady = 10, text=data,font=font.Font(family='Helvetica', size=20), anchor='w')
            ent = Entry(self)
            e[num] = ent
            self.pack(side=TOP, fill=X, padx=5, pady=5)
            lab.pack(side=LEFT)
            ent.pack(side=RIGHT, expand=YES, fill=X)
        Button(self, text='Show').pack(side=LEFT, padx=5, pady=5)
        Button(self, text='Insert to database').pack(side=LEFT, padx=5, pady=5)
        Button(self, text='Reset', command=DBOperations.reset_val).pack(side=RIGHT, padx=5, pady=5)
        button1 = tk.Button(self, text='Visit Page 1',  # when click on this button, call the show_frame method to make Show appear
                            command=lambda : controller.show_frame(Show))
        button1.pack() # pack it in
 
class Show(tk.Frame):
    def __init__(self, parent, controller):
        tk.Frame.__init__(self, parent)
        label = tk.Label(self, text='Page One', font=LARGE_FONT)
        label.pack(pady=10, padx=10)
 
        button1 = tk.Button(self, text='Back to Home', # likewise Insert
                            command=lambda : controller.show_frame(Insert))
        button1.pack()
 

if __name__ == '__main__':
    app = MainWindow()
    app.mainloop()