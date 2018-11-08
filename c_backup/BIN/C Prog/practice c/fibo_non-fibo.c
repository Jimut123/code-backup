#include<stdio.h>
int main()
{
	int i,j,n,sum=0,a,b;
	scanf("%d",&n);
	printf("\n");
	a=1;
	b=1;
	printf("Required Fibonacci Series:");
	printf(" %d  %d ",a,b);
	for(i=0;i<n-2;i++)				
	{
		sum=a+b;
		printf("%5d",sum);
		a=b;
		b=sum;
	}
	printf("\n");
	printf("\n");
	printf("Required Non-Fibonacci Series:");
	a=1,b=1;
	for(i=0;i<n-2;i++)				
		{
		sum=a+b;
		a=b;
		b=sum;
		for(j=a+1;j<=b-1;j++)
		{
			printf("%5d",j);
		}
		
	}
	return 0;
}
