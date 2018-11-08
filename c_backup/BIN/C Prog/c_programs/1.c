#include<stdio.h>
int main()
{
	int i,j,n,n1;
	scanf("%d",&n);
	n1=n-1;
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=n1;j++)
		printf(" ");
		n1--;
		for(j=1;j<=i;j++)
		printf("%3d",j);
		for(j=i-1;j>=1;j--)
		printf("%3d",j);
		printf("\n");
	}
	return 0;	
}
