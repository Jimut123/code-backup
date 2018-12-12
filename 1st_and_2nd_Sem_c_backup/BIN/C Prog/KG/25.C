/* Write a program to print the ASCII chart within a given number. */

#include <stdio.h>
main()
{
	int n,i;
	printf("\nENTER A NUMBER: ");
	scanf("%d",&n);
	for(i=0;i<=n;i++)
		printf("%d=%c ",i,i);
}
