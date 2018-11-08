#include<stdio.h>
#define array_size 100
void selection_sort(int a[array_size],int n)
{
int i,t,j;
for(i=0;i<n-1;i++)
{
for(j=i+1;j<n;j++)
{
if(a[i]>a[j])
{
t=a[i];
a[i]=a[j];
a[j]=t;
}
}
}
}