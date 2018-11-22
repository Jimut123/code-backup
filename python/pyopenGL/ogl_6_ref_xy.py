# program to plot axes and reflect it in all the three parts

from OpenGL.GL import *
from OpenGL.GLU import *
from OpenGL.GLUT import *
import sys


def init():
    glClearColor(1.0,1.0,1.0,1.0)
    gluOrtho2D(-1.0,1.0,-1.0,1.0)                   # set the coordinate system ranges (x-left,x-right,y-bottom,y-top)

def plotpoints():
    glClear(GL_COLOR_BUFFER_BIT)
    glColor3f(0.9,0.9,0.1)          # color
    # Drawing the triangle
    glBegin(GL_LINES)
    glVertex2f(0.7,0.5)
    glVertex2f(0.3,0.2)
    glEnd()
    glBegin(GL_LINES)
    glVertex2f(0.7,0.4)
    glVertex2f(0.3,0.2)
    glEnd()
    glBegin(GL_LINES)
    glVertex2f(0.7,0.4)
    glVertex2f(0.7,0.5)
    glEnd()

    #reflecting along the x-y axes

    glColor3f(0.9,0.9,0.1)          # color
    # Drawing the triangle
    glBegin(GL_LINES)
    glVertex2f(0.5,0.7)
    glVertex2f(0.2,0.3)
    glEnd()
    glBegin(GL_LINES)
    glVertex2f(0.4,0.7)
    glVertex2f(0.2,0.3)
    glEnd()
    glBegin(GL_LINES)
    glVertex2f(0.4,0.7)
    glVertex2f(0.5,0.7)
    glEnd()


    glColor3f(0.3,0.9,0.1)          # red color

    # Drawing the dodecagon
    glBegin(GL_LINES)
    glVertex2f(0.5,0.0)
    glVertex2f(0.5,0.2)
    glEnd()
    glBegin(GL_LINES)
    glVertex2f(0.5,0.2)
    glVertex2f(0.3,0.3)
    glEnd()
    glBegin(GL_LINES)
    glVertex2f(0.3,0.3)
    glVertex2f(0.2,0.5)
    glEnd()
    glBegin(GL_LINES)
    glVertex2f(0.2,0.5)
    glVertex2f(0.0,0.5)
    glEnd()
    

    glColor3f(0.9,0.9,0.1)          # color
    # Drawing the triangle
    glBegin(GL_LINES)
    glVertex2f(-0.7,0.5)
    glVertex2f(-0.3,0.2)
    glEnd()
    glBegin(GL_LINES)
    glVertex2f(-0.7,0.4)
    glVertex2f(-0.3,0.2)
    glEnd()
    glBegin(GL_LINES)
    glVertex2f(-0.7,0.4)
    glVertex2f(-0.7,0.5)
    glEnd()
    #reflecting along the x-y axes

    glColor3f(0.9,0.9,0.1)          # color
    # Drawing the triangle
    glBegin(GL_LINES)
    glVertex2f(-0.5,0.7)
    glVertex2f(-0.2,0.3)
    glEnd()
    glBegin(GL_LINES)
    glVertex2f(-0.4,0.7)
    glVertex2f(-0.2,0.3)
    glEnd()
    glBegin(GL_LINES)
    glVertex2f(-0.4,0.7)
    glVertex2f(-0.5,0.7)
    glEnd()

    glColor3f(-0.3,0.9,0.1)          # red color

    # Drawing the dodecagon
    glBegin(GL_LINES)
    glVertex2f(-0.5,0.0)
    glVertex2f(-0.5,0.2)
    glEnd()
    glBegin(GL_LINES)
    glVertex2f(-0.5,0.2)
    glVertex2f(-0.3,0.3)
    glEnd()
    glBegin(GL_LINES)
    glVertex2f(-0.3,0.3)
    glVertex2f(-0.2,0.5)
    glEnd()
    glBegin(GL_LINES)
    glVertex2f(-0.2,0.5)
    glVertex2f(-0.0,0.5)
    glEnd()

    glColor3f(0.9,0.9,0.1)          # color
    # Drawing the triangle
    glBegin(GL_LINES)
    glVertex2f(-0.7,-0.5)
    glVertex2f(-0.3,-0.2)
    glEnd()
    glBegin(GL_LINES)
    glVertex2f(-0.7,-0.4)
    glVertex2f(-0.3,-0.2)
    glEnd()
    glBegin(GL_LINES)
    glVertex2f(-0.7,-0.4)
    glVertex2f(-0.7,-0.5)
    glEnd()
    #reflecting along the x-y axes

    glColor3f(0.9,0.9,0.1)          # color
    # Drawing the triangle
    glBegin(GL_LINES)
    glVertex2f(-0.5,-0.7)
    glVertex2f(-0.2,-0.3)
    glEnd()
    glBegin(GL_LINES)
    glVertex2f(-0.4,-0.7)
    glVertex2f(-0.2,-0.3)
    glEnd()
    glBegin(GL_LINES)
    glVertex2f(-0.4,-0.7)
    glVertex2f(-0.5,-0.7)
    glEnd()

    glColor3f(-0.3,0.9,0.1)          # red color

    # Drawing the dodecagon
    glBegin(GL_LINES)
    glVertex2f(-0.5,-0.0)
    glVertex2f(-0.5,-0.2)
    glEnd()
    glBegin(GL_LINES)
    glVertex2f(-0.5,-0.2)
    glVertex2f(-0.3,-0.3)
    glEnd()
    glBegin(GL_LINES)
    glVertex2f(-0.3,-0.3)
    glVertex2f(-0.2,-0.5)
    glEnd()
    glBegin(GL_LINES)
    glVertex2f(-0.2,-0.5)
    glVertex2f(-0.0,-0.5)
    glEnd()

    # drawing the axes
    glColor3f(0.0,0.0,0.0)          # black color
    glBegin(GL_LINES)
    glVertex2f(-1.0,0.0)
    glVertex2f(1.0,0.0)
    glEnd()
    glBegin(GL_LINES)
    glVertex2f(0.0,1.0)
    glVertex2f(0.0,-1.0)
    glEnd()
    
    # drawing the x-y axes
    glColor3f(0.0,0.0,0.0)          # black color
    glBegin(GL_LINES)
    glVertex2f(-1.0,-1.0)
    glVertex2f(1.0,1.0)
    glEnd()

    glColor3f(0.9,0.9,0.1)          # color
    # Drawing the triangle
    glBegin(GL_LINES)
    glVertex2f(0.7,-0.5)
    glVertex2f(0.3,-0.2)
    glEnd()
    glBegin(GL_LINES)
    glVertex2f(0.7,-0.4)
    glVertex2f(0.3,-0.2)
    glEnd()
    glBegin(GL_LINES)
    glVertex2f(0.7,-0.4)
    glVertex2f(0.7,-0.5)
    glEnd()

    #reflecting along the x-y axes

    glColor3f(0.9,0.9,0.1)          # color
    # Drawing the triangle
    glBegin(GL_LINES)
    glVertex2f(0.5,-0.7)
    glVertex2f(0.2,-0.3)
    glEnd()
    glBegin(GL_LINES)
    glVertex2f(0.4,-0.7)
    glVertex2f(0.2,-0.3)
    glEnd()
    glBegin(GL_LINES)
    glVertex2f(0.4,-0.7)
    glVertex2f(0.5,-0.7)
    glEnd()


    glColor3f(0.3,0.9,0.1)          # red color

    # Drawing the dodecagon
    glBegin(GL_LINES)
    glVertex2f(0.5,-0.0)
    glVertex2f(0.5,-0.2)
    glEnd()
    glBegin(GL_LINES)
    glVertex2f(0.5,-0.2)
    glVertex2f(0.3,-0.3)
    glEnd()
    glBegin(GL_LINES)
    glVertex2f(0.3,-0.3)
    glVertex2f(0.2,-0.5)
    glEnd()
    glBegin(GL_LINES)
    glVertex2f(0.2,-0.5)
    glVertex2f(0.0,-0.5)
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