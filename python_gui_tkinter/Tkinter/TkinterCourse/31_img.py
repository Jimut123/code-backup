from tkinter import *

canvas_width = 1200
canvas_height = 700

master = Tk()

canvas = Canvas(master, 
           width=canvas_width, 
           height=canvas_height)
canvas.pack()

img = PhotoImage(file="python1.png")
canvas.create_image(20,20, anchor=NW, image=img)

mainloop()
