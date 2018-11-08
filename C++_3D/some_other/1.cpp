// To compile g++ gl.cpp -o gl -lGL -lGLU -lglut
#ifdef __1_CC__
#include<GL/glut.h>
#else
#include<GL/glut.h>
#endif
void display() {

  // Set every pixel in the frame buffer to the current clear color.
  glClear(GL_COLOR_BUFFER_BIT);

  // Drawing is done by specifying a sequence of vertices.  The way these
  // vertices are connected (or not connected) depends on the argument to
  // glBegin.  GL_POLYGON constructs a filled polygon.
  glBegin(GL_POLYGON);
    glColor3f(1, 0, 0); glVertex3f(-0.6, -0.75, 0.5);
    glColor3f(0, 1, 0); glVertex3f(0.6, -0.75, 0);
    glColor3f(0, 0, 1); glVertex3f(0, 0.75, 0);
  glEnd();

  // Flush drawing command buffer to make drawing happen as soon as possible.
  glFlush();
}

int main(int argc, char **argv)
{
    glutInit(&argc, argv);
    glutInitDisplayMode(GLUT_DOUBLE | GLUT_RGB);
    glutInitWindowSize(1024,768);
    glutInitWindowPosition(100,100);
    glutCreateWindow("Jimut Bahan Pal");
    glutDisplayFunc(display);
    //glClearColor(0.0f,0.0f,0.0f);
    glutMainLoop();
}