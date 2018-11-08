#include<stdio.h>
int main()
{
	float b;
	printf("Enter number for b:");
	scanf("%f",&b);
	if(b>=2)
		printf("\n f=ax^2+%f",b);
	else
		printf("\n f=ax+%fx",b);
	return 0;
}
