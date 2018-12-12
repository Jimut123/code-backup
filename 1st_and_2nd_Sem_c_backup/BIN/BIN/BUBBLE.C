#include<stdio.h>
void main()
{
int max,j,t,i,a[100],n;
clrscr();
printf("Enter the number of elements of an array : ");
scanf("%d",&n);
for(i=0;i<n;i++)
{
printf("Enter the %d no. element",i+1);
scanf("%d",&a[i]);
}
t=0;
for(i=0;i<n;i++)
{
for(j=0;j<n-i-1;j++)
{
if(a[j]>a[j+1])
{
t=a[j];
a[j]=a[j+1];
a[j+1]=t;
}
}
}
for(i=0;i<n;i++)
{
printf("%d\t",a[i]);
}
getch();
}