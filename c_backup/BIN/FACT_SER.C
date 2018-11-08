#include<stdio.h>
void main()
{
long int n,m,i,f=1,j,v=0,k,c=0,l=0;
clrscr();
printf("\n Enter the two limits lower and upper ::");
scanf("%lu",&m);
scanf("%lu",&n);
printf("\n%lu %lu\n",m,n);
for(i=m;i<=n;i++)
{
f=1;
c=0;
l++;
for(k=1;k<=i;k++)
{
f=1;
c++;
for(j=1;j<=k;j++)
f=f*j;
if(f>=n)
{
v=1;
break;
}
if(f>=m)
{
printf("f = %d c = %d l =%d\n",f,c,l);
}
}
if(v==1)
{
break;
}
if(f>=n)
{
break;
}
}
getch();
}