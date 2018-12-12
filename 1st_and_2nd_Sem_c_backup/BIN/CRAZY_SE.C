#include<stdio.h>
void main()
{
int i,j,n;
clrscr();
printf("Enter any number::");
scanf("%d",&n);
for(i=n-1;i>=1;i--)
{
for(j=i;j>=1;j--)
printf("%d ",1);
printf("%d ",(n-i));
printf("\n");
}
for(i=2;i<=n;i++)
{
printf("%d ",i);
if(i>0)
printf("%d",(n-i));
printf("\n");
}
getch();
}