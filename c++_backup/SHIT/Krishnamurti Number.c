//palindrom
#include<stdio.h>
int main ()
{
int n,s,n1,k;
scanf("\n %d",&n);
s= 0; n1=n;k=1;
while (n>0)
{
k=n%10;
s=(s*10)+k;
n=n/10;
}
printf ("\n %d",s);
{if (s==n1)
printf ("\nSame Result");
else
printf ("\n Not Same");
}
return 0;
}
