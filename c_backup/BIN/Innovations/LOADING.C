#include<stdio.h>
#include<stdlib.h>
void main()
{
int i,j;
for(i=0;i<=100;i++)
{
clrscr();
printf("\nLOADING\n");
printf("\t%d %age\n",i);
for(j=0;j<i;j++)
{
if(j%4==0)
printf(".");
}
delay(234);
}
}