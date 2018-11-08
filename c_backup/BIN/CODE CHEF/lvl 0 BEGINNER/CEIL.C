#include<stdio.h>
void main()
{
int n,m,k,d;
printf("Enter two numbers ::");
scanf("%d %d",&n,&m);
k=n-m;
if(k%10!=9)
k++;
else k--;
printf("\n%d",k);
}