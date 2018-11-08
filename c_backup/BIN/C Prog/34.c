/* to check whether a number is primr or not */
#include<stdio.h>
 main()
{
	int c=0,i,n;
	printf("enter the number for checking if it is prime or not:\n",n);
	scanf("%d", &n);
	for(i=2;i<=n-1;i++)
	{
		if(n%i==0)
		
		{
			c++;
			break;
		}
	}
	if(c==1)
	{
		printf("\nNot Prime");
	}
	else
	{
		printf("\nPrime");
	}
	return 0;
	
}
