from tkinter import *

def checkered(canvas, line_distance):
   # vertical lines at an interval of "line_distance" pixel
   for x in range(line_distance,canvas_width,line_distance):
      canvas.create_line(x, 0, x, canvas_height, fill="#476042")
   # horizontal lines at an interval of "line_distance" pixel
   for y in range(line_distance,canvas_height,line_distance):
      canvas.create_line(0, y, canvas_width, y, fill="#476042")


master = Tk()
canvas_width = 200
canvas_height = 100 
w = Canvas(master, 
           width=canvas_width,
           height=canvas_height)
w.pack()

checkered(w,10)

mainloop()
