#include<stdio.h>
#include<conio.h>
void main()
{
int r=3,c=4;
int *arr=(int *)malloc(r*c*sizeof(int));
int i,j,count=0;
clrscr();

for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
*(arr+i*c+j)=++count;
}
for(i=0;i<r;i++)
for(j=0;j<c;j++)
printf("\n%d",*(arr+i*c+j));
getch();
}