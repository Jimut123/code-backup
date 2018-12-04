# -*- coding: utf-8 -*-
"""
Spyder Editor

This is a temporary script file.
"""

# -StartPython.py *- coding: utf-8 -*-
"""
Spyder Editor

#%% starts a new cell. Use second green triangle to run just the cell that
your mouse has last clicked in (or Ctrl-Enter on a PC or Command-Return on a
Macintosh or Menu>Run>Run Cell)
"""
#%%
def hello():
    print("Hello, world!")

#%%
def myname():
    print("My name is Bill")
    
#%%
def ourschool():
    print("Coursera is our school")

#%%  
  
""" This will run forever. In this case Ctrl-C will stop it, but sometimes
that doesn't work. In that case, click away IP Console to stop; click yes to 
kill kernel. Open a new IPConsole on the Console menu to restart """
#%%
def forever():
    while True:
        pass
  
#%% 
    # -Exercises1.py *- coding: utf-8 -*-





"""
Student needs:
Exercises1.py

We will mainly use the following window panes: IPython Console, Editor, 
File Explorer, and Object Inspector.
#%% breaks up the Editor document into cells. The green triangle in the tool 
bar executes the entire file (after saving it), Ctrl-Enter (Command-Return on a
Mac) executes only the cell that the cursor is in (but does not save). 

Instructions on changing working directory in Spyder: At the top on the right 
you will see a path, the working directory. To its right is a yellow file 
folder. Click it and you can change the working directory. When you do, you 
can click the icon to the right of that and set that path as the IPython 
console's new working directory. Then all the panes: Editor, IPython Console, 
and File Explorer are pointed to this current working directory.  In the more 
recent versions of Spyder, this button has been eliminated and the editor and 
IPython console are automatically set to the current working directory. 
"""

"""
Quick look at arithmetic operations
+, -, *, **, /, //, %
These add, subtraction, multiple, exponentiate, divide, integer divide (drops
fractional part), computes remainder on division for integers.
Try some examples interactively in IPython window on lower right.
"""

#%% 
def areacircle(radius):
    """ Computes the area of a circle of the given radius """
    area = 3.14*radius**2
    print("The area of a circle of radius",radius,"is", area)

#%%
"""
Exercise:
Write a function 'def areatriangle(b,h)' to compute the area
of a triangle: formula is area = .5*b*h.
Output should look like:
The area of a triangle of base 3 and height 5 is 7.5

You can test your function by executing the following code:
"""
#%%
# The following will test areatriangle()
#areatriangle(3,5)
#areatriangle(2,20)
#%%
"""
Solution:
"""

def areatriangle(base,height):
    """ Computes the area of a triangle of given base and height"""
    area = .5*base*height
    print("The area of a triangle of base ",base," and height ",height," is ",area)
    
    
    
    
    
    
    
    
    
    
    




