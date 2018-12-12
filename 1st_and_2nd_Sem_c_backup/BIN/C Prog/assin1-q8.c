#include<stdio.h>
int main()
{
	int b;
	printf("Enter number for b:");
	scanf("%d",&b);
	if(b>=2)
		printf("\n f=ax^2+%d",b);
	else
		printf("\n f=ax+%dx",b);
	return 0;
}
