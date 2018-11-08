#include<stdio.h>
void main()
{
int max,i,a[100],n;
clrscr();
printf("Enter the number of elements of an array : ");
scanf("%d",&n);
for(i=0;i<n;i++)
{
printf("Enter the %d no. element :",i+1);
scanf("%d",&a[i]);
if(i==0)
{
max=a[i];
}
else
{
if(a[i]>max)
max=a[i];
}
}
printf("The maximum element : %d",max);
getch();
}