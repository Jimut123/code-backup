from OpenGL.GL import *
from OpenGL.GLU import *
from OpenGL.GLUT import *
import sys

def draw():
    glutWireTeapot(0.5)
    # glutWireSphere(0.50,50,10)
    # glutWireCylinder(20,30,40,30)
    # glutSolidTeapot(0.5)
    # glutWireTetrahedron(4,3,3)
    # glutWireCube(1.0)
    glFlush()


glutInit(sys.argv)                              # tells the python we are going to be displaying GLUT style graphics
glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB)
glutCreateWindow("My First OpenGL Prog")
glutInitWindowSize(250,50)
glutInitWindowPosition(100,100)
glutDisplayFunc(draw)
glutMainLoop()
