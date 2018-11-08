#include<stdio.h>
#include<stdlib.h>
#include<zarvis.h>
void main()
{
int d,i,m,j;
char c='0';
clrscr();
for(i=0;i<15;i++)
{
m=75;
for(j=0;j<=m;j++)
{
d=random(4);
if(d==0)
c='A';
if(d==1)
c='C';
if(d==2)
c='T';
if(d==3)
c='G';
printf("%c",c);
small_delay();
}
printf("\n");
}
getch();
}