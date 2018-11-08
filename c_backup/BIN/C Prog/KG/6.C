 /* Write a program to swap the values of two variables without using a third variable.*/

#include <stdio.h>
main()
{
	int a,b;
	clrscr();
	printf("\nENTER TWO NUMBERS FOR a AND b:\n");
	scanf("%d %d",&a,&b);
	printf("\nBEFORE SWAPING THE VALUE OF a=%d AND b=%d",a,b);
	a=a+b;
	b=a-b;
	a=a-b;
	printf("\nAFTER SWAPING THE VALUE OF a=%d AND b=%d",a,b);
	getch();
}
