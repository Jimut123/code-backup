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
    for a in np.arange(1.0,3.0,0.1):
        for t in np.arange(-200.0,200.4,0.005):
            x = a*math.sin(t**2)
            y = t*math.cos(t**2)
            glBegin(GL_POINTS)
            glVertex2f(x,y)
            glEnd()
            glFlush()

def main():
    glutInit(sys.argv)                              # tells the python we are going to be displaying GLUT style graphics
    glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB)
    glutCreateWindow("Plot Points")
    glutInitWindowSize(1000,1000)
    glutInitWindowPosition(500,700)
    glutDisplayFunc(plotfunc)
    init()
    glutMainLoop()

main()
