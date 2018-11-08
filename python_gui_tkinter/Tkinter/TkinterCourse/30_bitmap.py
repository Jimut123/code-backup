from tkinter import *

'''
The method create_bitmap() can be be used to include a bitmap on a canvas. The following bitmaps are available on all platforms:
"error", "gray75", "gray50", "gray25", "gray12", "hourglass", "info", "questhead", "question", "warning"

The following script puts all of these bitmaps on a canvas:

'''

canvas_width = 300
canvas_height =80

master = Tk()
canvas = Canvas(master, 
           width=canvas_width, 
           height=canvas_height)
canvas.pack()

bitmaps = ["error", "gray75", "gray50", "gray25", "gray12", "hourglass", "info", "questhead", "question", "warning"]
nsteps = len(bitmaps)
step_x = int(canvas_width / nsteps)

for i in range(0, nsteps):
   canvas.create_bitmap((i+1)*step_x - step_x/2,50, bitmap=bitmaps[i])

mainloop()


