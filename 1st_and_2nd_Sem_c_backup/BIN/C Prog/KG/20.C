				/* For Loop */
	/*Write a program to print the odd numbers within a given number.*/

#include <stdio.h>
main()
{
	int i,n;
	clrscr();
	printf("\nENTER A NUMBER: ");
	scanf("%d",&n);
	printf("\n ODD NUMBERS BETWEEN 1 AND %d ARE: \n",n);
	for(i=1;i<=n;i+=2)
	{
		printf("%d ",i);
	}
	getch();
}
