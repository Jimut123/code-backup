'''
We have demonstrated in the previous example how to create sliders. But it's not enough to have a slider, we also need a method to query it's value. We can accomplish this with the get method. We extend the previous example with a Button to view the values. If this button is pushed, the values of both sliders is printed into the terminal from which we have started the script:

'''
from tkinter import *

def show_values():
    print (w1.get(), w2.get())

master = Tk()
w1 = Scale(master, from_=0, to=42)
w1.pack()
w2 = Scale(master, from_=0, to=200, orient=HORIZONTAL)
w2.pack()
Button(master, text='Show', command=show_values).pack()

mainloop()

