#include<stdio.h>
#include"c:\turboc3\include\jimut\sort.h"
void main()
{
int i,n;
int a[100];
printf("\nEnter the size of array :");
scanf("%d",&n);
for(i=0;i<n;i++)
{
printf("\nEnter the %d element :\t",i+1);
scanf("%d",&a[i]);
}
merge_sort(a,0,n-1);
for(i=0;i<n;i++)
printf("%d\t",a[i]);
getch();
}