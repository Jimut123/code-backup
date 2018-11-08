from tkinter import *

# --- functions ---

def addtolist():
    global List

    List = []
    for item in varList:
        if item.get() != "":
            List.append(item.get())
    print(List)

# --- main ---

List = []
varList = []

myApp = Tk()
myApp.title("GUI app")
myApp.geometry("300x500")

var1 = StringVar()
cb1 = Checkbutton(myApp, text="Text1", variable=var1,
                           onvalue="Text1", offvalue="")
cb1.grid(row=0, column=1, sticky=W)

var2 = StringVar()
cb2 = Checkbutton(myApp, text="Text2", variable=var2,
                         onvalue="Text2", offvalue="")
cb2.grid(row=1, column=1,sticky=W)

varList.append(var1)
varList.append(var2)

b1 = Button(myApp, text="Add", command=addtolist)
b1.grid(row=1, column=2)

mainloop()
