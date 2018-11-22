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
    for x in np.arange(-5.0,5.0,0.04):
        #y=x*x-2
        #y=x**3-3*x-1
        #y=x**4-5*x**3+x**2-3*x-1
        #y=math.sin(x)
        #y=math.sin(3*x)
        #y=math.sin(x/3)
        y=2*math.cos(x)*math.sin(x)#+x**3-x**2
        # can replace almost any function here!
        #y=x**2
        #y=x**3
        #y=x**4+7*x
        
        #glBegin(GL_POINTS)
        glBegin(GL_LINES)
        
        glVertex2f(x,y)
        glVertex2f(x+0.5,y+0.5)
        glVertex2f(x-0.5,y-0.5)
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