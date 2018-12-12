#include<stdio.h>
void main()
{
int i,j,k;
clrscr();
for(i=0;i<=10;i++)
{
printf("%d\t",i);
for(k=0;k<=10000;k++)
for(j=0;j<=10000;j++);
}
getch();
}