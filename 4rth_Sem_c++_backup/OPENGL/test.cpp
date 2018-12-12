#include <GL/gl.h>
#include <GL/glut.h>

void display()
{
}

int main(int argc, char **argv)
{
    glutInit(&argc, argv);
    glutDisplayFunc(display);
    glutMainLoop();
}
