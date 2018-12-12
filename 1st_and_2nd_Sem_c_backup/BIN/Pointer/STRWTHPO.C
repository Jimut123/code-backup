#include<stdio.h>
struct list
{
int x;
double y;
};
void main()
{
struct list *l;
l=(struct list *)malloc(sizeof(struct list));
clrscr();
printf("\nEnter integer and double values::");
scanf("%d",&l->x);
scanf("%lf",&l->y);
fflush(stdin);
printf("\n%d",l->x);
printf("\n%lf",l->y);
getch();
}