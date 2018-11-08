/* Write a program to swap the values of two variables */
#include<stdio.h>
main()
{
	int a,b,c;
	printf("\n ENTER TWO NUMBERS FOR a AND b:");
	scanf("%d %d", &a, &b);
	printf("\n BEFORE SWAPING THE VALUES OF a=%d AND b=%d", a,b);
	c=a;
	a=b;
	b=c;
	printf("\n AFTER SWAPING THE VALUES OF a=%d AND b=%d", a,b);
	getch();	
}
