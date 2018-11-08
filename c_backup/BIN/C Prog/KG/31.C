/*  Write a program to check a given number is prime or not.  */

#include <stdio.h>
main()
{
	int n,i,c=0;
	
	printf("\nENTER A NUMBER: ");
	scanf("%d",&n);
	for(i=2;i<=(n/2);i++)
	{
		if(n%i==0)
		{
			c++;
			break;
		}
	}
	if(c==0)
		printf("\n%d IS A PRIME NUMBER",n);
	else
		printf("\n%d IS NOT A PRIME NUMBER",n);
	
}
