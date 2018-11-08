#include<stdio.h>
void main()
{
int i,n,a[100],j,max,lcm=1,v=0;
clrscr();
printf("Enter the size of the array ::");
scanf("%d",&n);
printf("Enter the array ::");
for(i=0;i<n;i++)
{
printf("Enter the %d th element ::",i+1);
scanf("%d",&a[i]);
}
max=a[0];
for(i=0;i<n;i++)
{
if(a[i]>max)
max=a[i];
}
for(i=2;i<=max;i++)
{
v=0;
for(j=0;j<n;j++)
{
if(a[j]%i==0)
{
a[j]=a[j]/i;
v=1;
}
}
if(v==1)
{
lcm=lcm*i;
i--;
}
}
//for(i=0;i<n;i++)
//printf("%d",a[i]);
printf("lcm = %d",lcm);
getch();
}