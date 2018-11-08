#include<stdio.h>
void main()
{
	int i,n,j;
	printf("Enter the number of lines to be printed:-");
	scanf("%d",&n);
	for(i=n;i>=1;i--);
	{
		for(j=1;j<=i;j++)
		printf("%d",j);
		printf("\n");
	}
}
