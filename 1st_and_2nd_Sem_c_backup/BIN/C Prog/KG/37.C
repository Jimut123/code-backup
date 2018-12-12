/*  Write a program to print a triangle like the following: -
	1
	2 3
	4 5 6
	7 8 9 10
	11 12 13 14 15
*/

#include <stdio.h>
main()
{
	int num,i,j,k=1;
	clrscr();
	printf("\nENTER THE NUMBER OF LINES: ");
	scanf("%d",&num);
	for(i=1;i<=num;i++)
	{
		for(j=1;j<=i;j++)
		{
			printf(" %d ",k);
			k++;
		}
		printf("\n");
	}
	getch();
}
