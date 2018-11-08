#include<stdio.h>
void main()
{
int a[]={1,2,9,12,-6,0};
/*
short x=-20;
x=x>>2;
printf("%d",x);
*/
int *p=a;
clrscr();
printf("%d",sizeof(p));
printf("%p\n",p);
printf("%p\n",a);
p++;
printf("%d\n",*p);
getch();
}