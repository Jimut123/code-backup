import tkinter as tk
from tkinter import messagebox

# --- classes --- (CamelCase names)

class PopUp(tk.Toplevel):

    def __init__(self, number=10):
        tk.Toplevel.__init__(self)

        # - global checkbox to set all "small" checkboxes -

        self.global_state = tk.BooleanVar()

        cb = tk.Checkbutton(self, text="select/deselect all",
                            variable=self.global_state,
                            command=self.select_clear_states)
        cb.grid(row=0, column=0, padx=5, pady=1)

        # - "small" checkboxes -

        self.states = []

        for n in range(1, number+1):
            var = tk.BooleanVar()
            cb = tk.Checkbutton(self, text=str(n), variable=var)
            cb.grid(row=n, column=0, padx=5, pady=1)
            self.states.append(var)


    def select_clear_states(self):
        # get global checkbox
        state = self.global_state.get()

        # set all "small" checkboxes
        for x in self.states:
            x.set(state)

# --- functions --- (lower_case names)

def popup(num):

    win = PopUp(num)
    #win.states[1].set(True)

# --- main --- (lower_case names)

root = tk.Tk()

b = tk.Button(root, text="5 checkboxes", command=lambda:popup(5))
b.pack()

b = tk.Button(root, text="10 checkboxes", command=lambda:popup(10))
b.pack()

b = tk.Button(root, text="3 checkboxes", command=lambda:popup(3))
b.pack()

root.mainloop()
