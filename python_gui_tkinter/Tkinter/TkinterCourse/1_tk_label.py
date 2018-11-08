'''
 A Label is a Tkinter Widget class, which is used to display text or an image. The label is a widget that the user just views but not interact with.

'''

import tkinter as tk
#The tkinter module, containing the Tk toolkit, has always to be imported. In our example, we imported tkinter by renaming it into tk, which is the preferred way to do it:

# if you are still working under a Python 2 version, 
# comment out the previous line and uncomment the following line
# import Tkinter as tk

root = tk.Tk()
# To initialize tkinter, we have to create a Tk root widget, which is a window with a title bar and other decoration provided by the window manager. The root widget has to be created before any other widgets and there can only be one root widget. 

# The next line of code contains the Label widget. The first parameter of the Label call is the name of the parent window, in our case "root". So our Label widget is a child of the root widget. The keyword parameter "text" specifies the text to be shown: 
w = tk.Label(root, text="Hello Tkinter!.. This is an hello World example!")

# The pack method tells Tk to fit the size of the window to the given text. 
w.pack()

# The window won't appear until we enter the Tkinter event loop: 
root.mainloop()

# Our script will remain in the event loop until we close the window. 

