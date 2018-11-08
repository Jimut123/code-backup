'''
Tkinter (and TK of course) provides a set of dialogues (dialogs in American English spelling), which can be used to display message boxes, showing warning or errors, or widgets to select files and colours. There are also simple dialogues, asking the user to enter string, integers or float numbers.

Let's look at a typical GUI Session with Dialogues and Message boxes. There might be a button starting the dialogue, like the "quit" button in the following window:

'''
"""

The tkMessageBox consists of the following functions, which correspond to dialog windows:

    askokcancel(title=None, message=None, **options)
    Ask if operation should proceed; return true if the answer is ok
    askquestion(title=None, message=None, **options)
    Ask a question
    askretrycancel(title=None, message=None, **options)
    Ask if operation should be retried; return true if the answer is yes
    askyesno(title=None, message=None, **options)
    Ask a question; return true if the answer is yes
    askyesnocancel(title=None, message=None, **options)
    Ask a question; return true if the answer is yes, None if cancelled.
    showerror(title=None, message=None, **options)
    Show an error message
    showinfo(title=None, message=None, **options)
    Show an info message
    showwarning(title=None, message=None, **options)
    Show a warning message

"""
from tkinter import *
#from tkMessageBox import *
import tkinter.messagebox as tkm

def answer():
    tkm.showerror("Answer", "Sorry, no answer available")

def callback():
    if tkm.askyesno('Verify', 'Really quit?'):
        tkm.showwarning('Yes', 'Not yet implemented')
    else:
        tkm.showinfo('No', 'Quit has been cancelled')

Button(text='Quit', command=callback).pack(fill=X)
Button(text='Answer', command=answer).pack(fill=X)
mainloop()
