#include<stdio.h>
void main()
{
int *a,i,n;
clrscr();
printf("Enter the value of n::");
scanf("%d",&n);
a=(int *)malloc(n*sizeof(int));
printf("Enter the elements:");
for(i=0;i<n;i++)
scanf("%d",(a+i));
for(i=0;i<n;i++)
printf("\n%d",*(a+i));

getch();
}