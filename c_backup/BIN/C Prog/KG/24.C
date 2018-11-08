 /* Write a program to print the multiplication table of a given number. */

#include <stdio.h>
main()
{
	int n,i,p;
	//clrscr();
	printf("\nENTER A NUMBER: ");
	scanf("%d",&n);
	printf("\nENTER THE LIMITING VALUE: ");
	scanf("%d",&p);
	printf("\nMULTIPLICATION TABLE OF %d\n",n);
	for(i=1;i<=p;i++)
	{
		printf("\n%2d x %2d = %5d",n,i,n*i);
	}
//	getch();
}

