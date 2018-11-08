#include<stdio.h>
void main()
{
int a=3,*p,**q;
clrscr();
p=&a;
printf("a = %d\n",a);
printf("address of a = %u\n",&a);
printf("p = %u\n",p);
printf("p is pointing to a = %d\n",*p);
q=&p;
printf("q = %u\n",q);
printf("q is pointing to p = %u\n",*q);
getch();
}