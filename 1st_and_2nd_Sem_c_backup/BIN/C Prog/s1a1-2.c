/* evaluating the power of a number */
#include<stdio.h>
int main()
{
	int base, pow,i=1;
	long int value=1;
	printf("\n enter the base no:");
	scanf("%d",&base);
	printf("\n enter the power:");
	scanf("%d",&pow);
	value*=base;
	while(i<=pow)
	{
	value=value*base;
	i++;
	}
	printf("\n%d to the power %d is %ld",base,pow,value);
	return 0;
}
