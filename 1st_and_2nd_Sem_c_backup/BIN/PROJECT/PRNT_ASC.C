/**********************************************************
 Statement - Print All ASCII Values
 Programmer - Vineet Choudhary
 Written For - https://turboc.codeplex.com
 **********************************************************/

#include<stdio.h>
#include<conio.h>

void main()
{
    int i = 0;
    char ch;
    clrscr();
    
    for (i = 0; i < 256; i++)
    {
        printf("%c ",ch);
        ch = ch + 1;
    }
    
    getch();
}