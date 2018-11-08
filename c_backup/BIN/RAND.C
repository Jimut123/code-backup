#include<stdio.h>
#include<stdlib.h>
void main()
{
int d,i,m;
clrscr();
for(i=0;;i++)
{
m=random(170);
for(i=0;i<=m;i++)
{
d=random(256);
if(d>=65&&d<=91||d>97&&d<121)
{
printf("%c",d);
delay(66);
}
}
printf("\n");
}
getch();
}