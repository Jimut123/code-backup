/* Write a program to swap the values of two variables. */

#include <stdio.h>
main()
{
	int a,b,c;
	clrscr();
	printf("\nENTER TWO NUMBERS FOR a AND b:");
	scanf("%d %d",&a,&b);
	printf("\nBEFORE SWAPING THE VALUE OF a=%d AND b=%d",a,b);
	c=a;
	a=b;
	b=c;
	printf("\nAFTER SWAPING THE VALUE OF a=%d AND b=%d",a,b);
	getch();
}