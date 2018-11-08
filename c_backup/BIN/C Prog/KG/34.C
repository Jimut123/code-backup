/*  Write a program to check a given number is Armstrong or not.
    A number is said to be Armstrong if sum of the cube of the individual
    digit is equal to the number.
    Example: - 153 = (1)^3 + (5)^3 + (3)^3.*/

#include <stdio.h>
main()
{
	int num,num1,digit,arm=0;
	printf("\nENTER A NUMBER: ");
	scanf("%d",&num);
	num1=num;
	do
	{
		digit=num%10;
		num=num/10;
		arm=arm+(digit*digit*digit);
	}
	while(num!=0);
	if(arm==num1)
		printf("\n%d IS AN ARMSTORNG NUMBER",num1);
	else
		printf("\n%d IS NOT AN ARMSTRONG NUMBER",num1);
	}
