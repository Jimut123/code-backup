from tkinter import *
from tkinter.colorchooser import askcolor                

'''
There are applications where the user should have the possibility to select a colour. Tkinter provides a pop-up menu to choose a colour. To this purpose we have to import the tkColorChooser module and have to use the method askColor:

result = tkColorChooser.askColor ( color, option=value, ...)

If the user clicks the OK button on the pop-up window, respectively, the return value of askColor() is a tuple with two elements, both a representation of the chosen colour, e.g. ((106, 150, 98), '#6a9662')
The first element return[0] is a tuple (R, G, B) with the RGB representation in decimal values (from 0 to 255). The second element return[1] is a hexadecimal representation of the chosen colour.
If the user clicks "Cancel" the method returns the tuple (None, None).

The optional keyword parameters are:
color 	The variable color is used to set the default colour to be displayed. If color is not set, the initial colour will be grey.
title 	The text assigned to the variable title will appear in the pop-up window's title area. The default title is "Color".
parent 	Make the pop-up window appear over window W. The default behaviour is that it appears over the root window.


Let's have a look at an example:

    Tkinter → tkinter
    tkMessageBox → tkinter.messagebox
    tkColorChooser → tkinter.colorchooser
    tkFileDialog → tkinter.filedialog
    tkCommonDialog → tkinter.commondialog
    tkSimpleDialog → tkinter.simpledialog
    tkFont → tkinter.font
    Tkdnd → tkinter.dnd
    ScrolledText → tkinter.scrolledtext
    Tix → tkinter.tix
    ttk → tkinter.ttk


'''

def callback():
    result = askcolor(color="#6A9662", 
                      title = "Bernd's Colour Chooser") 
    print (result)
    
root = Tk()
Button(root, 
       text='Choose Color', 
       fg="darkgreen", 
       command=callback).pack(side=LEFT, padx=10)
Button(text='Quit', 
       command=root.quit,
       fg="red").pack(side=LEFT, padx=10)
mainloop()
