/* Write a program to compute the seconds from a given age. */

#include <stdio.h>
main()
{
	long unsigned age,sec;
	clrscr();
	printf("\nENTER YOUR AGE: ");
	scanf("%lu",&age);
	sec=age*365*24*60*60;
	printf("\nAGE IN SECONDS: %lu",sec);
	getch();
}