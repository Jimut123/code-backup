from tkinter import *
#from tkFileDialog   import askopenfilename      
from tkinter import filedialog as fd

'''
There is hardly any serious application, which doesn't need a way to read from a file or write to a file. Furthermore, such an application might have to choose a directory. Tkinter provides the module tkFileDialog for these purposes.
'''


def callback():
    name= fd.askopenfilename() 
    print (name)
    
fd.errmsg = 'Error!'
Button(text='File Open', command=callback).pack(fill=X)
mainloop()

