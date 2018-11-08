/**********************************************************
 Statement - Modify the constant variable in c
 Programmer - Vineet Choudhary
 Written For - https://turboc.codeplex.com
 **********************************************************/
#include<stdio.h>
#include<conio.h>

void main()
{
 const int i=10;
 int *ptr=&i;
 clrscr();
 *ptr=(int *)20;
 printf("%d",i);
 getch();
}