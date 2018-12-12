/*	Write a program to compute the factorial of a given number.	*/

#include <stdio.h>
main()
{
	int i,n;
	unsigned long fact=1;
	printf("\nENTER A NUMBER: ");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		fact=fact*i;
	}
	printf("\nFACTORIAL OF %d IS %lu",n,fact);
}
