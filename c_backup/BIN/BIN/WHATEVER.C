#include<stdio.h>
void main()
{
int x,m=10,y,e=2;
clrscr();
x=m;
y=1;
while(x-y>e)
{
x=(x+y)/2;
y=m/x;
}
printf("%d",x);
getch();
}