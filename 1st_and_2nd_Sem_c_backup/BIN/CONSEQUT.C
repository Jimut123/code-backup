#include<stdio.h>
void main()
{
long int n,n1,d=0,s1=0,s2=0,p,j,i,fact1=0,fact2=0,k,f,s=0,flag=5,h,min,l;
clrscr();
printf("\n Enter a number ::");
scanf("%lu",&n);
n1=n;
min=n1%10;
while(n1!=0)
{
d++;
h=n1%10;
if(h<=min)
min=h;
p=1;
for(j=1;j<=h;j++)
{
p=p*j;
}
fact1=fact1+p;
n1=n1/10;
}
s2=0;
for(i=1;i<=d;i++)
{
p=1;
s1=s1*10+i+(min-1);
}
l=s1;
while(l!=0)
{
d=l%10;
s2=s2*10+d;
p=1;
for(j=1;j<=d;j++)
p=p*j;
fact2+=p;
l=l/10;
}
//printf("s1=%lu fact = %lu min = %lu\n fact2 = %lu",s1,fact1,min,fact2);
//printf("s2=%lu\n",s2);


for(i=s1;i<=s2;i++)
{
k=i;
s=0;
while(k!=0)
{
d=k%10;
f=1;
for(j=1;j<=d;j++)
f=f*j;
s=s+f;
k=k/10;
}
if(s==fact2)
{
//printf("%lu\n",i);
if(i==n)
{
flag=1;
break;
}
}
}
if(flag==1)
printf("Consecutive");
//else if(flag==5)
//printf("Error");
else
printf("Not consecutive");
getch();
}