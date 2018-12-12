#include<stdio.h>
#include<math.h>
void main()
{
int n,i,v=0,k,m,p;
double q,o,r=0;
clrscr();
printf("Enter the number to find the square root of ::");
scanf("%d",&n);
for(i=1;i<=n/2;i++)
{
k=i*i;
if(k>n)
{
m=i;
v=0;
break;
}
//printf("i = %d ",i);
if(n==k)
{
v=1;
break;
}
}
if(v==1)
printf("Number is a perfect square and the square root :: %d",i);
else
{
m--;
//printf("\n%d",m);
//printf("---------");
r=(double)m;
for(i=1;i<9;i++)
{
for(p=1;p<10;p++)
{
o=(double) p/pow(10,i);
q=(double)r+o;
if((q*q)>(double)n)
break;
}
//printf("\n%0.5lf",r);
o=(double) (--p)/pow(10,i);
q=(double)r+o;
r=r+o;
}
}
printf("\n%0.7lf",r);
getch();
}