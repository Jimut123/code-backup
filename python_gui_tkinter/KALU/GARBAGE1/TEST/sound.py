from tkinter import *
import mp3play

root = Tk() # create tkinter window

f = mp3play.load('alrt1.mp3'); play = lambda: f.play()
button = Button(root, text = 'Play', command = play)

button.pack()
root.mainloop()
