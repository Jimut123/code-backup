	/* Write a program to print the reverse of a given number.*/
		/* Example: - Reverse of 2565 is 5652. */
#include <stdio.h>
main()
{
	unsigned long num,rev;
	printf("\nENTER A NUMBER: ");
	scanf("%lu",&num);
	printf("\nTHE REVERSE OF THE NUMBER %lu IS ",num);
	do
	{
		rev=num%10;
		num=num/10;
		printf("%lu",rev);
	}
	while(num!=0);
}
