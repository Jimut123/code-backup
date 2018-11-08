#include<stdio.h>
struct abc
{
int x;
float y;
}
void main()
{
struct abc a;
clrscr();
printf("\n Enter data ::");
scanf("%d",&a.x);
scanf("%d",&a.y);
printf("\n %d",a.x);
printf("\n %d",a.y);
getch();
}