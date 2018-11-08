'''

A radio button, sometimes called option button, is a graphical user interface element of Tkinter, which allows the user to choose (exactly) one of a predefined set of options. Radio buttons can contain text or images. The button can only display text in a single font. A Python function or method can be associated with a radio button. This function or method will be called, if you press this radio button.

Radio buttons are named after the physical buttons used on old radios to select wave bands or preset radio stations. If such a button was pressed, other buttons would pop out, leaving the pressed button the only pushed in button.

Each group of Radio button widgets has to be associated with the same variable. Pushing a button changes the value of this variable to a predefined certain value.

'''


import tkinter as tk

root = tk.Tk()

v = tk.IntVar()

tk.Label(root,
        text="""Choose a
programming language:""",
        justify = tk.LEFT,
        padx = 20).pack()
tk.Radiobutton(root,
              text="Python",
              padx = 20,
              variable=v,
              value=1).pack(anchor=tk.W)
tk.Radiobutton(root,
              text="Ruby",
              padx = 20,
              variable=v,
              value=2).pack(anchor=tk.W)
tk.Radiobutton(root,
              text="C++",
              padx = 20,
              variable=v,
              value=3).pack(anchor=tk.W)
tk.Radiobutton(root,
              text="Java",
              padx = 20,
              variable=v,
              value=4).pack(anchor=tk.W)
tk.Radiobutton(root,
              text="Shell",
              padx = 20,
              variable=v,
              value=5).pack(anchor=tk.W)

tk.Radiobutton(root,
              text="Perl",
              padx = 20,
              variable=v,
              value=6).pack(anchor=tk.W)

root.mainloop()


