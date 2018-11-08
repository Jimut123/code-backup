'''
The Button widget is a standard Tkinter widget, which is used for various kinds of buttons. A button is a widget which is designed for the user to interact with, i.e. if the button is pressed by mouse click some action might be started. They can also contain text and images like labels. While labels can display text in various fonts, a button can only display text in a single font. The text of a button can span more than one line.

A Python function or method can be associated with a button. This function or method will be executed, if the button is pressed in some way.

The following script defines two buttons: one to quit the application and another one for the action, i.e. printing the text "Printing in terminal ...Tkinter ... yay!!" on the terminal.


'''



import tkinter as tk


def write_slogan():
    print("Printing in terminal ...Tkinter ... yay!!")

root = tk.Tk()
frame = tk.Frame(root)
frame.pack()

button = tk.Button(frame,
                   text="QUIT",
                   fg="red",
                   command=quit)
button.pack(side=tk.LEFT)
slogan = tk.Button(frame,
                   text="Hello",
                   command=write_slogan)
slogan.pack(side=tk.LEFT)

root.mainloop()
