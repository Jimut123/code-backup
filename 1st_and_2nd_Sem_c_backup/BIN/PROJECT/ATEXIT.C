/********************************************************************
 Statement - Write a function which executes after the main function
 Programmer - Vineet Choudhary
 Written For - https://turboc.codeplex.com
 ********************************************************************/

#include <stdio.h>
#include <conio.h>
#include <stdlib.h>

void fun();

void main(int argc, char *argv[]){
    clrscr();
    atexit(fun);
    printf("Turbo ");
    getch();
}

void fun(){
    printf("C++");
}

/*
The atexit function is passed the address of a function (func) to be called when the program terminates normally. Successive calls to atexit create a register of functions that are executed in last-in, first-out (LIFO) order. The functions passed to atexit cannot take parameters.
*/