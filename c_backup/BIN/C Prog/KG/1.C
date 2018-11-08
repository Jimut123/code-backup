/* Write a program to compute the addition, subtraction, product,
quotient and remainder of two given numbers.*/

#include <stdio.h>
#include<conio.h>
main()
{
	int n1,n2,add,sub,prod,quot,remain;
	printf("\nENTER NUMBER-1: " );
	scanf("%d",&n1);
	printf("\nENTER NUMBER-2: " );
	scanf("%d",&n2);
	add=n1+n2;
	sub=n1-n2;
	prod=n1*n2;
	quot=n1/n2;
	remain=n1%n2;
	printf("\n\t ADDITION OF THE NUMBERS: %d",add);
	printf("\n\t SUBSTRACTION OF THE NUMBERS: %d",sub);
	printf("\n\t PRODUCTION OF THE NUMBERS: %d",prod);
	printf("\n\t QUOTIENT OF THE NUMBERS: %d",quot);
	printf("\n\t REMAINDER OF THE NUMBERS: %d",remain);
}
