/**********************************************************
 Statement - Find the size of a union
 Programmer - Vineet Choudhary
 Written For - https://turboc.codeplex.com
 **********************************************************/

#include <stdio.h>
#include <conio.h>

void main()
{
    union sample
    {
        int   m;
        float n;
        char  ch;
    };
    
    union sample u;
    clrscr();
    
    printf("The size of union =%d\n", sizeof(u));
    
    /*initialization */
    
    u.m = 25;
    printf("%d %f %c\n", u.m, u.n,u.ch);
    
    u.n = 0.2;
    printf("%d %f %c\n", u.m, u.n,u.ch);
    
    u.ch = 'p';
    printf("%d %f %c\n", u.m, u.n,u.ch);
    
    getch();
}    	/*End of main() */

/*-----------------------------------------
 Output
 The size of union =4
 25 12163373596672.000000 
 -13107 0.200000 Õ
 -13200 0.199999 p
 ------------------------------------------*/