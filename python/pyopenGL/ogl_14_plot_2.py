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
        for t in np.arange(-4.4,4.4,0.01):
            x = 0.3*a*(t*t-3)
            y = 0.1*a*t*(t*t-3)
            glBegin(GL_POINTS)
            glVertex2f(x,y)
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
