		/* Control Statements*/
		/* Conditional Control Statements */
		/* If Conditions */
/* Write a program to compute net amount from the given quantity purchased
and rate per quantity. Discount @10% is allowed if quantity purchased exceeds 100.
Net Amount = (Quantity Purchased x Rate Per Quantity)-Discount.*/

#include <stdio.h>
main()
{
	int qty,rate;
	long disc=0.0,net;
	clrscr();
	printf("\nENTER QUANTITY: ");
	scanf("%d",&qty);
	printf("\nENTER RATE: ");
	scanf("%d",&rate);
	if (qty>100)
	{
		disc=qty*rate*10/100;
		printf("\n CONGRATS U are getting a DISCOUNT of 10% \n");
	}
	net=(qty*rate)-disc;
	printf("\n\t NET AMOUNT: %lu",net);
	getch();
}