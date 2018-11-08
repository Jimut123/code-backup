/*  Write a program to print a triangle like the following: -
	1
	1 2
	1 2 3
	1 2 3 4
	1 2 3 4 5
*/

#include <stdio.h>
main()
{
	int num,i,j;
	clrscr();
	printf("\nENTER THE NUMBER OF LINES: ");
	scanf("%d",&num);
	for(i=1;i<=num;i++)
	{
		for(j=1;j<=i;j++)
		{
			printf("%d ",j);
		}
		printf("\n");
	}
	getch();
}
