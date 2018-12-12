/* Write a program to compute simple interest and compound interest from
	the given principal, time period and interest rate.*/

#include <stdio.h>
#include <math.h>
main()
{
	unsigned int p,t;
	float si,ci,r,i;
	clrscr( );
	printf("\nENTER PRINCIPAL: ");
	scanf("%d",&p);
	printf("\nENTER TIME PERIOD: ");
	scanf("%d",&t);
	printf("\nENTER RATE OF INTEREST: ");
	scanf("%f",&r);
	si=(p*t*r)/100;
	i=r/100;
	ci=p*pow((1+i),t);
	printf("\nSIMPLE INTEREST: %5.2f",si);
	printf("\n\nCOMPOUND INTEREST: %5.2f",ci);
	getch();
}

/* Note: - To use the pow() function <math.h> header file must be included. */