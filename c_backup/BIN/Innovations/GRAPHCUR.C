#include<stdio.h>
#include<stdlib.h>
void main()
{
int i,j;
clrscr();
for(i=0;i<=300;i++)
{
//clrscr();
//printf("\nLOADING\n");
printf("*");
for(j=0;j<i;j++)
{
printf(".");
//if(j%100==0)
//printf("\n");
}
delay(100);
}
}