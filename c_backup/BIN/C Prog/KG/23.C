  /* Write a program to add the even numbers within a given number. */

#include <stdio.h>
main()
{
	int i,n;
	unsigned long sum=0;
	clrscr();
	printf("\nENTER A NUMBER: ");
	scanf("%d",&n);
	for(i=2;i<=n;i+=2)
	{
		sum=sum+i;
	}
	printf("\nSUM OF THE EVEN NUMBERS BETWEEN 1 TO %d IS %lu",n,sum);
	getch();
}