/*
typedef unsigned int    GLenum;
typedef unsigned char   GLboolean;
typedef unsigned int    GLbitfield;
typedef void            GLvoid;
typedef signed char     GLbyte;          1-byte signed 
typedef short           GLshort;         2-byte signed 
typedef int             GLint;           4-byte signed 
typedef unsigned char   GLubyte;         1-byte unsigned 
typedef unsigned short  GLushort;        2-byte unsigned 
typedef unsigned int    GLuint;          4-byte unsigned 
typedef int             GLsizei;         4-byte signed 
typedef float           GLfloat;         single precision float 
typedef float           GLclampf;        single precision float in [0,1] 
typedef double          GLdouble;        double precision float 
typedef double          GLclampd;        double precision float in [0,1] 
*/
#include<iostream>
#include<cstdlib>
typedef float j_float;
int main()
{
    j_float test = 5.90;
    std::cout<<test<<std::endl;
}