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
    a = 2.0
    b = 1.25
    for t in np.arange(-12.56,12.56,0.001):
        x = (a+b)*math.cos(t) -  b*math.cos((a/b+1.0)*t)
        y = (a+b)*math.sin(t) -  b*math.sin((a/b+1.0)*t)
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
