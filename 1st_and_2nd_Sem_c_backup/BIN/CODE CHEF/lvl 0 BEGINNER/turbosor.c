#include<stdio.h>
#include<math.h>
#include<stdlib.h>
#define array_size 100
int a[100];
void shell_sort(int a[100],int);
void shell_sort(int a[array_size],int n)
{
int i,j,k,t;
for(i=n/2;i>0;i=i/2)
{
for(j=i;j<n;j++)
{
for(k=j-i;k>=0;k=k-i)
{
if(a[k+i]>=a[k])
break;
else
{
t=a[k];
a[k]=a[k+i];
a[k+i]=t;
}
}
}
}
}
int main()
{
int n,i;
scanf("%d",&n);
for(i=0;i<n;i++)
{
scanf("%d",&a[i]);
}
shell_sort(a,n);
for(i=0;i<n;i++)
{
printf("%d\n",a[i]);
}
}
