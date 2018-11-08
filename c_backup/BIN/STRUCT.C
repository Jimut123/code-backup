#include<stdio.h>
struct abc
{
int a;
int b;
int c;
};
void main()
{
struct abc a1;
clrscr();
printf("Enter Data :");
scanf("%d",&a1.a);
scanf("%d",&a1.b);
scanf("%d",&a1.c);
printf("\n%d",a1.a);
printf("\n%d",a1.b);
printf("\n%d",a1.c);
getch();
}