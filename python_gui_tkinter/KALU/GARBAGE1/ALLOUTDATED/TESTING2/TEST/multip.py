import tkinter as tk
LARGE_FONT = ("Verdana", 12) # font's family is Verdana, font's size is 12 
 
class MainWindow(tk.Tk):
    def __init__(self, *args, **kwargs):
        tk.Tk.__init__(self, *args, **kwargs)
        self.title("Fuzzy System") # set the title of the main window
        self.geometry("300x300") # set size of the main window to 300x300 pixels
 
        # this container contains all the pages
        container = tk.Frame(self)
        container.pack(side="top", fill="both", expand=True)
        container.grid_rowconfigure(0, weight=1)   # make the cell in grid cover the entire window
        container.grid_columnconfigure(0,weight=1) # make the cell in grid cover the entire window
        self.frames = {} # these are pages we want to navigate to
 
        for F in (StartPage, PageOne): # for each page
            frame = F(container, self) # create the page
            self.frames[F] = frame  # store into frames
            frame.grid(row=0, column=0, sticky="nsew") # grid it to container
 
        self.show_frame(StartPage) # let the first page is StartPage
 
    def show_frame(self, name):
        frame = self.frames[name]
        frame.tkraise()
 
class StartPage(tk.Frame):
    def __init__(self, parent, controller):
        tk.Frame.__init__(self, parent)
        label = tk.Label(self, text='Start Page', font=LARGE_FONT)
        label.pack(pady=10, padx=10) # center alignment
 
        button1 = tk.Button(self, text='Visit Page 1',  # when click on this button, call the show_frame method to make PageOne appear
                            command=lambda : controller.show_frame(PageOne))
        button1.pack() # pack it in
 
class PageOne(tk.Frame):
    def __init__(self, parent, controller):
        tk.Frame.__init__(self, parent)
        label = tk.Label(self, text='Page One', font=LARGE_FONT)
        label.pack(pady=10, padx=10)
 
        button1 = tk.Button(self, text='Back to Home', # likewise StartPage
                            command=lambda : controller.show_frame(StartPage))
        button1.pack()
 
if __name__ == '__main__':
    app = MainWindow()
    app.mainloop()