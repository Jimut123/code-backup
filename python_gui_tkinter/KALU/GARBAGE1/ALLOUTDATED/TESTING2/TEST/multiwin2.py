import tkinter as tk

from tkinter import *

class windowclass():

        def __init__(self,master):
                self.master = master
                self.frame = tk.Frame(master)
                self.lbl = Label(master , text = "Label")
                self.lbl.pack()
                self.btn = Button(master , text = "Button" , command = self.command )
                self.btn.pack()
                self.frame.pack()

        def command(self):
                print ('Button is pressed!')

                self.newWindow = tk.Toplevel(self.master)
                self.app = windowclass1(self.newWindow)

class windowclass1():

        def __init__(self , master):
                self.master = master
                self.frame = tk.Frame(master)
                master.title("a")
                self.quitButton = tk.Button(self.frame, text = 'Quit', width = 25 , command = self.close_window)
                self.quitButton.pack()
                self.frame.pack()


        def close_window(self):
                self.master.destroy()


root = Tk()

root.title("window")

root.geometry("350x50")

cls = windowclass(root)

root.mainloop()