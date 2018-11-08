from tkinter import *
master = Tk()
var = []
row_no = 0
for i in range(25):
    var.append(IntVar())
for i in range(25):
	Checkbutton(master, text="male", variable=var[i]).grid(row=row_no, sticky=W)
	row_no = row_no + 1
def show():
	#row_no = 0
	i=0
	for i in range(25):
		print(var[i].get())
		#row_no = row_no + 1
Button(master, text='show selected', command=show).grid(row=row_no+1, column=2, sticky=W, pady=4)
mainloop()

