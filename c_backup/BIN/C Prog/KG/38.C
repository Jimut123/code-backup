/*  Write a program to print a triangle like the following: -
          1
	    1 1 1
      1 1 1 1 1
    1 1 1 1 1 1 1
  1 1 1 1 1 1 1 1 1
*/

#include <stdio.h>
main()
{
	int num,i,j,k,s=40;
	printf("\nENTER THE NUMBER OF LINES: ");
	scanf("%d",&num);
	for(i=1;i<=num;i++)
	{
		for(j=1;j<=s;j++)
			printf(" ");
		for(k=1;k<=i;k++)
			printf("1");
		for(k=i-1;k>0;k--)
			printf("1");
		printf("\n");
		s--;
	}
}
