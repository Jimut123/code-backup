#include<stdio.h>
#include<stdio.h>
void main()
{
int r=3,c=4,i,j,count;
int **a=(int **)malloc(r*sizeof(int *));
clrscr();
for(i=0;i<r;i++)
{
a[i]=(int *)malloc(c*sizeof(int));
}
count=0;
for(i=0;i<r;i++)
for(j=0;j<c;j++)
a[i][j]=++count;
for(i=0;i<r;i++)
for(j=0;j<c;j++)
printf("\n%d",a[i][j]);
getch();
}