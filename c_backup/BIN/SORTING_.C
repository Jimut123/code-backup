#include<stdio.h>
void sort(int *,int);
void main()
{
int a[30],i,n;
clrscr();
printf("Enter the number of elements:");
scanf("%d",&n);
printf("Enter the %d datas ::",n);
for(i=0;i<n;i++)
scanf("%d",&a[i]);
sort(a,n);
getch();
}
void sort(int *a,int n)
{
int i,j,t;
for(i=0;i<n;i++)
{
for(j=0;j<n-i-1;j++)
{
if(*(a+j)>*(a+j+1))
{
t=*(a+j);
*(a+j)=*(a+j+1);
*(a+j+1)=t;
}
}
}
printf("The sorted array ::");
for(i=0;i<n;i++)
printf("%d\n",*(a+i));
}