#include<stdio.h>
void add(int x,int y)
{
int z;
z=x+y;
printf("\n %d",z);
}
void main()
{
void (*sum)(int,int);
int a,b;
scanf("%d",&a);
scanf("%d",&b);
sum=&add;
sum(a,b);
}
