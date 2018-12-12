#include<stdio.h>
#define MAX 999999
void factorial(int n)
{
long long x,i,res[MAX];
long long res_size=1;
res[0]=1;
for(x=2;x<=n;x++)
res_size=multiply(x,res,res_size);
for(i=res_size-1;i>=0;i--)
{
printf("%lu",res[i]);
}
}
long long multiply(long long x,long long res[],long long res_size)
{
long long i,prod,carry=0;
for(i=0;i<res_size;i++)
{
prod = res[i]*x+carry;
res[i]=prod%10;
carry=prod/10;
}
while(carry)
{
res[res_size]=carry%10;
carry= carry/10;
res_size++;
}
return res_size;
}
void main()
{
long long n;
clrscr();
printf("The number which u want to factorial ::");
scanf("%lu",&n);
factorial(n);
getch();
}