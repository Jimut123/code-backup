from tkinter import StringVar, Tk, Label, Checkbutton, IntVar

def update_label():
    if var.get() == 1:
        label_text.set("On")
    else:
        label_text.set("Off")

window = Tk()

label_text = StringVar()
label = Label(window, textvariable=label_text)
label_text.set("Off")

var = IntVar()
check= Checkbutton(window,  text="On", variable=var,
                   onvalue=1, offvalue=0, command=update_label)

label.pack()
check.pack(side="left")

window.mainloop()
