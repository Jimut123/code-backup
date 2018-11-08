#include<stdio.h>
void main()
{
int r=3;
int c=4;
int **a;
int count = 0;
int i,j;
a=(int **)malloc(sizeof(int *)*r);
a[0]=(int *)malloc(sizeof(int)*c*r);
clrscr();
for(i=0;i<r;i++)
a[i]=(*a+c*i);
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
a[i][j]=++count;//*(*(a+i)+j)=++count;
}
for(i=0;i<r;i++)
for(j=0;j<c;j++)
printf("\n%d",a[i][j]);
getch();
}