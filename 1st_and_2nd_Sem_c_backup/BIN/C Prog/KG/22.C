/*	Write a program to add the odd numbers within a given number.	*/

#include <stdio.h>
main()
{
	int i,n;
	unsigned long sum=0;
	printf("\nENTER A NUMBER: ");
	scanf("%d",&n);
	for(i=1;i<=n;i+=2)
	{
		sum=sum+i;
	}
	printf("\nSUM OF THE ODD NUMBERS BETWEEN 1 TO %d IS %lu",n,sum);
}
