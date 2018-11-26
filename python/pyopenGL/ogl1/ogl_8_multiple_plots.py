#// last done till 43 pg no do the graph inequalities the next day.

from OpenGL.GL import *
from OpenGL.GLU import *
from OpenGL.GLUT import *
import sys
#from numpy import *
import numpy as np
import math

def init():
    glClearColor(1.0,1.0,1.0,1.0)
    gluOrtho2D(-5.0,5.0,-5.0,5.0)  

def plotfunc():
    glClear(GL_COLOR_BUFFER_BIT)
    glColor3f(0.0,0.0,0.0)          # color
    glPointSize(3.0)
    for x in np.arange(-5.0,5.0,0.0001):
        #y=x*x-2
        #y=x**3-3*x-1
        #y=x**4-5*x**3+x**2-3*x-1
        #y=math.sin(x)
        #y=math.sin(3*x)
        a=7*x**2
        y=2*math.cos(x)*math.sin(x)#+x**3-x**2
        k=math.sqrt(5**2-x**2)
        # can replace almost any function here!
        #y=x**2
        b=x**3
        #y=x**4+7*x
        
        #glBegin(GL_POINTS)
        glBegin(GL_POINTS)
        glColor3f(0.9,0.0,0.9)          # color
        glVertex2f(x,y)
        glColor3f(0.3,0.5,0.0)          # color
        glVertex2f(x+0.5,y+0.5)
        glColor3f(0.4,0.4,0.5)          # color
        glVertex2f(x,a)
        glColor3f(0.0,5.0,0.7)          # color
        glVertex2f(x,b)
        
        glColor3f(0.9,0.5,0.7)          # color for circle
        glVertex2f(x,k)

        glColor3f(0.0,5.0,0.7)          # color
        glVertex2f(x,-k)

        glEnd()
    # adding coordinates
    glBegin(GL_LINES)
    glVertex2f(-5.0,0.0)
    glVertex2f(5.0,0.0)
    glVertex2f(0.0,5.0)
    glVertex2f(0.0,-5.0)
    glEnd()
    glFlush()

def main():
    glutInit(sys.argv)                              # tells the python we are going to be displaying GLUT style graphics
    glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB)
    glutCreateWindow("Plot Points")
    glutInitWindowSize(400,400)
    glutInitWindowPosition(50,50)
    glutDisplayFunc(plotfunc)
    init()
    glutMainLoop()

main()