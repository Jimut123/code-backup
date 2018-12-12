			/* Loop Control Statements */
				/* While Loop */
/* Write a program to print natural numbers up to a given number.*/

#include <stdio.h>
main()
{
	int i=1,n;
	printf("\nENTER A NUMBER: ");
	scanf("%d",&n);
	printf("\nNATURAL NUMBERS UPTO %d ARE:\n",n);
	while(i<=n)
	{
		printf(" %d ",i++);
		/* i=i+1; */
	}
}
