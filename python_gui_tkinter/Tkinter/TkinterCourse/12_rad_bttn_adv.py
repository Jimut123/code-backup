'''
In many cases, there are more than two radio buttons. It would be cumbersome, if we have to define and write down each button. The solution is shown in the following example. We have a list "languages", which contains the button texts and the corresponding values. We can use a for loop to create all the radio buttons. 
'''

import tkinter as tk

root = tk.Tk()

v = tk.IntVar()
v.set(1)  # initializing the choice, i.e. Python

languages = [
    ("Python",1),
    ("Perl",2),
    ("Java",3),
    ("C++",4),
    ("C",5),
    ("Ruby",6),
    ("Shell",7),
    ("JavaScript",8),
    ("Awk",9),
    ("APL",10),
    ("C#",11),
    ("brainfuck",12),
    ("SQL",13),
]

def ShowChoice():
    print(v.get())

tk.Label(root,
         text="""Choose your favourite
programming language:""",
         justify = tk.LEFT,
         padx = 20).pack()

for val, language in enumerate(languages):
    tk.Radiobutton(root,
                  text=language,
                  padx = 20,
                  variable=v,
                  command=ShowChoice,
                  value=val).pack(anchor=tk.W)


root.mainloop()
