/*	Write a program to evaluate x^n.		*/
#include <stdio.h>
main()
{
	int num,temp,power,i;
	unsigned long res=1;
	printf("\nENTER A NUMBER: ");
	scanf("%d",&num);
	printf("\nENTER THE POWER: ");
	scanf("%d",&power);
	for(i=1;i<=power;i++)
	{
		res=res*num;
	}
	printf("\nTHE %d POWER OF %d IS %lu",power,num,res);
	}
}

