from OpenGL.GL import *
from OpenGL.GLU import *
from OpenGL.GLUT import *
import sys
def init():
    #glClearColor(0.0,0.0,0.0,1.0)                   # set the background color to black (R,G,B,alpha)
    #glClearColor(0.5,0.8,0.3,1.0)
    glClearColor(0.7,0.0,0.7,1.0)
    gluOrtho2D(-1.0,1.0,-1.0,1.0)                   # set the coordinate system ranges (x-left,x-right,y-bottom,y-top)
def plotpoints():
    glClear(GL_COLOR_BUFFER_BIT)
    glColor3f(1.0,0.0,0.0)

    #actual plotting of points
    glPointSize(50.0)                                   # defines the point size
    #glBegin(GL_POINTS)
    #glBegin(GL_LINES)
    #glBegin(GL_LINE_STRIP)
    glBegin(GL_LINE_LOOP)
    glVertex2f(0.0,0.0)
    glVertex2f(1.0,1.0)
    glVertex2f(-1.0,1.0)
    glEnd()
    glFlush()
def main():
    glutInit(sys.argv)                              # tells the python we are going to be displaying GLUT style graphics
    glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB)
    glutCreateWindow("Plot Points")
    glutInitWindowSize(500,500)
    glutInitWindowPosition(50,50)
    glutDisplayFunc(plotpoints)
    init()
    glutMainLoop()
main()