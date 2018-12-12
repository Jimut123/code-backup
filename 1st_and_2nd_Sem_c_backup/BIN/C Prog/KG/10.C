/* Write a program to find out the gross amount from the given basic pay.
Gross = Basic + DA + HRA
DA & HRA can be calculated as follows: -
If Basic Pay is greater than or equal to 8000 DA is 45% of Basic Pay
& HRA is 25% of Basic Pay, otherwise DA is 40% of Basic Pay
& HRA is 15% of Basic Pay.*/

#include <stdio.h>
main()
{
	float basic,da,hra,gross;
	clrscr();
	printf("\nENTER BASIC PAY: ");
	scanf("%f",&basic);
	if(basic>=8000)
	{
		da=basic*45/100;
		hra=basic*25/100;
	}
	else
	{
		da=basic*40/100;
		hra=basic*15/100;
	}
	gross=basic+da+hra;
	printf("\nGROSS AMOUNT: %0.3f",gross);
	getch();
}