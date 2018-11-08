/* program to print factorial of a given number */
#include<stdio.h>
int main()
{
	int fact=1, i,n;
	printf(" Enter the number:");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		fact*=i;
	}
	printf("\n Factorial is: %d",fact);
	return 0;
}
