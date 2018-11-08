/**********************************************
 Statement - Drawing Line in Graphics Mode
 Programmer - Vineet Choudhary
 Written For - https://turboc.codeplex.com
 **********************************************/

#include<graphics.h>
#include<stdio.h>
#include<conio.h>

void main(void) {
    int gdriver = DETECT, gmode;
    int x1 = 200, y1 = 200;
    int x2 = 300, y2 = 300;

    
    initgraph(&gdriver, &gmode, "c:\\turboc3\\bgi");
    line(x1, y1, x2, y2);
    closegraph();
    getch();
}

/*
 
Explanation of Code :

1. int x1=200, y1=200;
   int x2=300, y2=300;
   We have declared above variables so that we can keep track of starting and ending point.
 

2. line(x1,y1,x2,y2);
   We need to pass just 4 parameters to the line() function.
 
3. Line Function Draws Line From (x1,y1) to (x2,y2) .
    Syntax : line(x1,y1,x2,y2);
    ->Parameter	Explanation
        x1	X Co-ordinate of First Point
        y1	Y Co-ordinate of First Point
        x2	X Co-ordinate of Second Point
        y2	Y Co-ordinate of Second Point
*/