#include<stdio.h>
long a[100],z;
int count=0;
int main()
{
int T,i,j;
long g,num;
scanf("%d",&T);
for(i=0;i<T;i++)
{
scanf("%ld",&g);
z=1;
for(j=1;j<=g;j++)
{
z=z*j;
}
a[count++]=z;
//printf("%d\n",z);
z=0;
}
for(i=0;i<count;i++)
{
printf("%ld\n",a[i]);
}
//printf("%ld",g);
return 0;
}
