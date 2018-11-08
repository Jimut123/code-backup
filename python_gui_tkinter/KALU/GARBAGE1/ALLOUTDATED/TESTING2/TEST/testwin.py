
from tkinter import *
import tkinter

window = tkinter.Tk()                           #Here is where we set up the window and it's aesthetics,
window.title("BINARY-SUMZ!!!")                  #here we give the window a name,
window.geometry("1000x800")                     #here we give the window a size,
window.wm_iconbitmap('flower3.ico')             #and here we give the window an icon.

def Destroy():              #this function destroys any widgets on the current page.
    for widget in window.winfo_children():
        widget.destroy()

def StartButton():                                                                      #This function starts the game after being clicked on.
	print ("Game started from beginning.")
	Intro()                                                                  #This function starts the game after being clicked on.



def Menu():   #Creating a menu function
    SumsTitle = tkinter.Label(window, text="BINARY-SUMS!!!",                    #Here is where we create the title for the menu screen, we give it a name,               
                        fg = "light Green",                                 #a foreground (text) color
                        bg = "tomato",                                    #a backgorund color
                        font = "'Bauhaus 93 bold italic")
SumsTitle.pack()            #and the text is given a font.

StartButtonWid = tkinter.Button(window, text = "Start Learning!!!",
                                fg = "tomato",
                                command= (StartButton))
StartButtonWid.pack()             #Setting up the button for the start of the game.

TitleCanvas = tkinter.Canvas(window, bg = "light blue" ,
                             height = 1000,
                             width = 1000)
TitleCanvas.pack()

def Intro():
    Destroy()          #This function works fine
    SumsTitle = tkinter.Label(window, text="Welcome!!!",                    #Here is where we create the title for the menu screen, we give it a name,               
                        fg = "light green",                                 #a foreground (text) color
                        bg = "tomato",                                    #a backgorund color
                        height = 1,
                        width = 14,
                        font = "'Bauhaus 93 bold italic")
SumsTitle.pack()
Intro1 = tkinter.Label(window, text='Welcome to BINARY-SUMS!!! The fun, interactive binary learning game! in this game we will be learning about language based topics', 
                               font= "30")
Intro1.pack()
Intro2 = tkinter.Label(window, text='that will be vital to know in your AS computing or computer science exams. Please click the screen to continue.',
                               font= "30")
Intro2.pack()

IntroCanvas = tkinter.Canvas(window, bg = "light blue" ,
                             height = 1500,
                             width = 1000)

IntroCanvas.bind("<Button-1>",  Activ1())
IntroCanvas.pack()


def Activ1():
    Destroy()     #this function crashes.

if __name__ == "__main__":
    Menu()





tkinter.mainloop()