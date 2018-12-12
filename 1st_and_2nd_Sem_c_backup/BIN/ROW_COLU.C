#include<stdio.h>
void main()
{
int i,j,a[20][20],n1[20],n2[20],f=0,n,l=0;
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
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(i==j)
n1[f++]=a[i][j];
if(i+j==n-1)
n2[l++]=a[i][j];
}
}
for(i=0;i<n;i++)
{
printf("%d\t",n1[i]);
}
printf("\n\n");
for(i=0;i<n;i++)
{
printf("%d\t",n2[i]);
}
getch();
}