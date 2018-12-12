#include<stdio.h>
struct emp
{
int x;
};
struct emp* add(struct emp*);
void show(struct emp*);
void main()
{
struct emp *e;
e=(struct emp*)malloc(sizeof(struct emp));
clrscr();
e=add(e);
show(e);
getch();
}
struct emp* add(struct emp* e)
{
scanf("%d",&e->x);
return e;
}
void show(struct emp *e)
{
printf("\n %d",e->x);
}
