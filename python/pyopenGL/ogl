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
    gluOrtho2D(-2.0,2.0,-2.0,2.0)

def plotfunc():
    glClear(GL_COLOR_BUFFER_BIT)
    glColor3f(0.0,0.0,0.0)          # color
    glPointSize(1.0)
    for a in np.arange(1.0,3.0,0.1):
        for t in np.arange(-200.0,200.4,0.005):
            x = math.sin(0.99*t) - 0.7*math.cos(3.01*t)
            y = math.cos(1.01*t) + 0.1*math.sin(15.03*t)
            glBegin(GL_POINTS)
            glVertex2f(x,y)
            glEnd()
            glFlush()

def main():
    glutInit(sys.argv)                              # tells the python we are going to be displaying GLUT style graphics
    glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB)
    glutCreateWindow("Plot Points")
    glutInitWindowSize(1000,1000)
    glutInitWindowPosition(50,50)
    glutDisplayFunc(plotfunc)
    init()
    glutMainLoop()

main()
