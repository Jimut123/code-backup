#include<stdio.h>
int fact(int);
int main()
{
	int i,n,mul=1;
	printf("\nEnter the number: ");
	scanf("%d",&n);
	/*for(i=n;i>=1;i--)
		mul=mul*i;*/
	printf("\nFactorial of the given number: %d",fact(i));
	return 0;	
}
int fact(int i)
{
	if(i==1)
		return 1;
	else
		return (i*fact(i-1));
}

