#include<stdio.h>
long a[100];
int count=0;
int main()
{
int T,i,j,z=0;
long g,num;
scanf("%d",&T);
for(i=0;i<T;i++)
{
scanf("%ld",&g);
num=g;
while(num>=5)
{
num=num/5;
z=z+num;
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
