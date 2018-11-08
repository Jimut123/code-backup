#include<stdio.h>
void diagonal(int a[][],int,int);
void main()
{
int i,j,a[20][20],n;
printf("Enter the value of n:");
scanf("%d",&n);
printf("Enter the array ::");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
printf("Enter the element of the %d th row and %d column array",i+1,j+1);
scanf("%d",&a[i][j]);
}
}
i=0;
j=0;
diagonal(a[][],n,i);
getch();
}
void diagonal(int a[][],int n,int i)
{
if(i>=n)
return;
else
{
printf("%d\t",a[i][j]);
printf("%d\t",a[i][n-i-1);
diagonal(a,n,n+1);
}
}