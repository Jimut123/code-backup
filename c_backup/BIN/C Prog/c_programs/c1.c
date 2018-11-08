#include<stdio.h>
main()
{
	int i,dec,bin=0;
	printf("\nEnter a decimal number: ");
	scanf("%d",&dec);
	while(dec>0)
	{
		bin=bin+(dec%2)*pow(10,i++);
		dec=dec/2;
	}
	printf("\nRequired binary number: %d",bin);
	return 0;	
}
