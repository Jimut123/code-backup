// #include <GL/GLUT.h> // Might need to change this for Linux, as this example is for a Mac.
#include <GL/gl.h>
#include <GL/glut.h>
 
void render(void);
 
int main(int argc, char** argv)
{
    glutInit(&argc, argv);
    glutInitDisplayMode(GLUT_DEPTH | GLUT_DOUBLE | GLUT_RGBA);
    glutInitWindowPosition(100, 100);
    glutInitWindowSize(640, 480);
    glutCreateWindow("Simple GLUT application");
 
    glutDisplayFunc(render);
 
    glutMainLoop(); // Says process has finished and can start rendering.
}
 
void render(void)
{
} 
