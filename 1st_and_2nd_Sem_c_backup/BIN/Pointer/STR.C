#include<stdio.h>
struct abc
{
int x;
float y;
};
void main()
{
struct abc a;
clrscr();
printf("\n Enter data ::");
scanf("%d",&a.x);
scanf("%f",&a.y);
printf("\n %d",a.x);
printf("\n %f",a.y);
getch();
}