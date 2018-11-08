/*
 * GL01Hello.cpp: Test OpenGL/GLUT C/C++ Setup
 * Tested under Eclipse CDT with MinGW/Cygwin and CodeBlocks with MinGW
 * To compile with -lfreeglut -lglu32 -lopengl32
 */
//#include <windows.h>  // for MS Windows
#include <GL/glut.h>  // GLUT, include glu.h and gl.h
#include<iostream>
#include<cstdlib>
#include<random>
#include<ctime>         // for generating random number
#include <chrono>
#include <thread>

/* Handler for window-repaint event. Call back when the window first appears and
   whenever the window needs to be re-painted. */
float random_generator()
{
    int rand_num;
    srand(time(NULL));
    rand_num = ((rand() % 10) + 1);
    return rand_num;
}
void sleep_me()
{
    using namespace std::this_thread;     // sleep_for, sleep_until
    using namespace std::chrono_literals; // ns, us, ms, s, h, etc.
    using std::chrono::system_clock;
    sleep_for(1ns);
    sleep_until(system_clock::now() + 1ns);
}
void display() {
   //std::cout<<random_generator()<<std::endl;
  glClearColor(0.0f, 0.0f, 0.0f, 1.0f); // Set background color to black and opaque
   glClear(GL_COLOR_BUFFER_BIT);         // Clear the color buffer (background)
 
   // Draw a Red 1x1 Square centered at origin
   float k1 = random_generator()/10;
   //sleep_me();
   float k2 = random_generator()/10;
   //sleep_me();
   float k3 = random_generator()/10;
   std::cout<<'('<<k1<<","<<k2<<","<<k3<<")"<<std::endl;
   glBegin(GL_QUADS);              // Each set of 4 vertices form a quad
      glColor3f(k1, k2, k3); // Red
      glVertex2f(-0.5f, -0.5f);    // x, y
      glVertex2f( 0.5f, -0.5f);
      glVertex2f( 0.5f,  0.5f);
      glVertex2f(-0.5f,  0.5f);
   glEnd();
 
   glFlush();  // Render now
}
 
/* Main function: GLUT runs as a console application starting at main()  */
int main(int argc, char** argv) {
   glutInit(&argc, argv);                 // Initialize GLUT
   glutCreateWindow("OpenGL Setup Test"); // Create a window with the given title
   glutInitWindowSize(320, 320);   // Set the window's initial width & height
   glutInitWindowPosition(50, 50); // Position the window's initial top-left corner
   for(int i = 1;i<=10;i++)
   {
    glClear(GL_COLOR_BUFFER_BIT);         // Clear the color buffer (background)
    glutDisplayFunc(display); // Register display callback handler for window re-paint
   }
   glutMainLoop();           // Enter the event-processing loop
   return 0;
}