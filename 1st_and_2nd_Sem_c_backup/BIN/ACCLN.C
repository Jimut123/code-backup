#include<stdio.h>
void main()
{
int i,j,k,c=0,l=0;
clrscr();
for(i=0;c<5000;i++)
{
printf(".");
c=c+50;
l=l+250;
for(j=0;j<c;j++)
for(k=0;k<l;k++);
}
for(;i>=0;i--)
{
printf(".");
c=c-50;
l=l-250;
for(j=c;j>=0;j--)
for(k=l;k>=0;k--);
}
}