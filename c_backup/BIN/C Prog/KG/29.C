/*	Write a program to evaluate
	1/(1 Factorial) + 2/(2 Factorial) + .... + n/(n Factorial).*/

#include <stdio.h>

main()
{
	float n,i,j,sum=0.0,fact=1.0;
	printf("\nENTER A NUMBER: ");
	scanf("%f",&n);
	for(i=1;i<=n;i++)
	{
		fact=1.0;
		for(j=1;j<=i;j++)
		{
			fact=fact*j;
		}
		sum=sum+(i/fact);
	}
	printf("\nTHE SUMMATION IS: %0.2f",sum);
}


