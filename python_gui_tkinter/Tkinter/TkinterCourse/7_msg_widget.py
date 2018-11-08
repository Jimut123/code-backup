'''
The widget can be used to display short text messages. The message widget is similar in its functionality to the Label widget, but it is more flexible in displaying text, e.g. the font can be changed while the Label widget can only display text in a single font. It provides a multiline object, that is the text may span more than one line. The text is automatically broken into lines and justified. We were ambiguous, when we said, that the font of the message widget can be changed. This means that we can choose arbitrarily a font for one widget, but the text of this widget will be rendered solely in this font. This means that we can't change the font within a widget. So it's not possible to have a text in more than one font. If you need to display text in multiple fonts, we suggest to use a Text widget.

The syntax of a message widget:

w = Message ( master, option, ... )

Let's have a look at a simple example.  
'''

import tkinter as tk
master = tk.Tk()
whatever_you_do = "So this is a line\n this is another line \n good day!!!"
msg = tk.Message(master, text = whatever_you_do)
msg.config(bg='lightgreen', font=('times',45, 'bold'), fg = 'red')
msg.pack()
tk.mainloop()
