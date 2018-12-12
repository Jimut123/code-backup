  /* Write a program to add the even and odd numbers within a given number. */

#include <stdio.h>
main()
{
	int i,n;
	unsigned long sumeven=0,sumodd=0;
/*	sumeven=sumodd=0; */
	clrscr();
	printf("\nENTER A NUMBER: ");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		if(i%2 == 0)
			sumeven=sumeven+i;
		else
			sumodd=sumodd+i;
	}
printf("\nSUM OF THE EVEN NUMBERS BETWEEN 1 TO %d IS %lu",n,sumeven);
printf("\nSUM OF THE ODD NUMBERS BETWEEN 1 TO %d IS %lu",n,sumodd);
getch();
}
