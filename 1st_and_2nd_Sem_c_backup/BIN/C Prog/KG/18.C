			/* Do While Loop */
/* Write a program to print the sum of digit of a given number. */

#include <stdio.h>
main()
{
	int digit;
	unsigned long num,sum=0;
	clrscr();
	printf("\nENTER A NUMBER: ");
	scanf("%lu",&num);
	do
	{
		digit=num%10;
		num=num/10;
		sum=sum+digit;
	}
	while(num!=0);
	printf("\nSUM OF THE DIGITS IS %lu",sum);
	getch();
}
