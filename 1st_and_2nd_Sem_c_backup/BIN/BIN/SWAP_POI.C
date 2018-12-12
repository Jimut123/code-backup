#include<stdio.h>
void main()
{
int x,y;
clrscr();
x=10;
y=20;
printf("x = %d y = %d",x,y);
swap(&x,&y);
printf("x = %d y = %d",x,y);
getch();
}
int swap(int *x,int *y)
{
int t;
t=*x;
*x=*y;
*y=t;
return 0;
}

