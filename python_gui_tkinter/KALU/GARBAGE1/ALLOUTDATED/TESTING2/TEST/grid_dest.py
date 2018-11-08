from tkinter import *

class Page(Frame):
    """Page is the Frame that will be added/removed at will"""
    def __init__(self, root, id):
        Frame.__init__(self, root)
        Label(self, text="Frame %d" % id).pack()

class Application(Frame):
    """Main application where everything is done"""
    def __init__(self, root):
        Frame.__init__(self, root)
        self.root = root
        self.page = 0
        self.pages = [Page(self, x) for x in range(5)]#creates list of 5 pages
        self.pages[self.page].pack(side=TOP)
        Button(self, text="Next", command=self.next).pack(side=BOTTOM)

    def next(self):
        """changes the current page. I've only done next here, but you could
        do backwards, skip pages, etc"""
        self.pages[self.page].pack_forget() #remove the current page
        self.page += 1
        if self.page >= 5: #checking haven't gone past the end of self.page
            self.page = 0
        self.pages[self.page].pack(side=TOP) #add the next one
        
if __name__ == "__main__":
    root = Tk()
    app = Application(root)
    app.pack()
    root.mainloop()
