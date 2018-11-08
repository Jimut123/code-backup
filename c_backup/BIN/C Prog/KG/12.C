/* Write a program to check whether a given year is leap year or not. */

#include <stdio.h>
main()
{
	int year;
	printf("\nENTER A YEAR: ");
	scanf("%d",&year);
	if(year%4==0 && year%100 !=0 || year%400==0)
		printf("\n%d IS A LEAP YEAR",year);
	else
		printf("\n%d IS NOT A LEAP YEAR",year);
}
