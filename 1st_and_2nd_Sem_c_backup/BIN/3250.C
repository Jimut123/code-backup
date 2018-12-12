#include<stdio.h>
#define MAX 9999
void factorial(int n)
{
int x,i,res[MAX];
int res_size=1;
res[0]=1;
for(x=2;x<=n;x++)
res_size=multiply(x,res,res_size);
for(i=res_size-1;i>=0;i--)
{
printf("%d",res[i]);
}
}
int multiply(int x,int res[],int res_size)
{
int i,prod,carry=0;
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
int n;
clrscr();
printf("The number which u want to factorial ::");
scanf("%d",&n);
factorial(n);
getch();
}