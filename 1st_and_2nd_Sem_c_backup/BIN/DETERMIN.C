#include<stdio.h>
void main()
{
int n,a[100][100],i,j;
clrscr();
printf("Enter the value of the one side of the determinant :\n");
scanf("%d",&n);
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
printf("Enter the element of the %d row aand %d column :\n",i,j);
scanf("%d",&a[i][j]);
}
}
getch();
}

