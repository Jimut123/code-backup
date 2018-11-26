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
    glPointSize(1.0)
    for x in np.arange(-5.0,5.0,0.01):
        y=x**2
        glBegin(GL_POINTS)
        glColor3f(0.9,0.0,0.9)          # color
        glVertex2f(x,y)
        glEnd()
        for a in np.arange(-5.0,5.0,0.01):
            if a<x*x and x>0 and a>0:
                glColor3f(0.5,0.5,0.5)
                glBegin(GL_POINTS)
                glVertex2f(x,a)
                glEnd()
    # adding coordinates
    glBegin(GL_LINES)
    glVertex2f(-5.0,0.0)
    glVertex2f(5.0,0.0)
    glVertex2f(0.0,5.0)
    glVertex2f(0.0,-5.0)
    glVertex2f(-5.0,-5.0)
    glVertex2f(3.0,5.0)
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
