#include<stdio.h>
int main()
{
	int i,j,k,n;
	printf("\nEnter the limiting value: ");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		for(k=1;k<=n-1;k++)
		{
			printf(" ");
			for(j=1;j<=i;j++)
			printf(" * ");
			printf("\n");
		}
	}
	return 0;
}
