/*  Triangles
    Write a program to print a triangle like the following: -
	1
	1 1
	1 1 1
	1 1 1 1
	1 1 1 1 1
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
			printf("1");
		}
		printf("\n");
	}
	getch();
}
