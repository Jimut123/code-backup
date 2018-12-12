/*  Write a program to print a triangle (Floyds Triangle) like the following: -
	      1
    	1 2 1
      1 2 3 2 1
    1 2 3 4 3 2 1
  1 2 3 4 5 4 3 2 1
*/

#include <stdio.h>
main()
{
	int num,i,j,k,s=40;
	clrscr();
	printf("\nENTER THE NUMBER OF LINES: ");
	scanf("%d",&num);
	for(i=1;i<=num;i++)
	{
		for(j=1;j<=s;j++)
			printf("   ");
		for(k=1;k<=i;k++)
			printf("%3d",k);
		for(k=i-1;k>0;k--)
			printf("%3d",k);
		printf("\n");
		s--;
	}
	getch();
}
