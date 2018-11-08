from tkinter import *

canvas_width = 200
canvas_height =200

master = Tk()

w = Canvas(master, 
           width=canvas_width, 
           height=canvas_height)
w.pack()

w.create_oval(50,50,200,100)

mainloop()


