/*  Write a program to print the prime numbers within a given number.  */

#include <stdio.h>

main()
{
	int n,i,j,c=0;
	clrscr();
	printf("\nENTER A NUMBER: ");
	scanf("%d",&n);
	printf("\nPRIME NUMBERS WITHIN %d ARE:\n",n);
	for(i=1;i<=n;i++)
	{
		c=0;
		for(j=1;j<=i;j++)
		{
			if(i%j==0)
				c++;
		}
		if(c==2)
			printf("%d ",i);
	}
	getch();
}
