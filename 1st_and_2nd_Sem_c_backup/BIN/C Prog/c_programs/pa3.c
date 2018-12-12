#include<stdio.h>
#include<stdlib.h>
int main()
{
	int i,x,n;
	float sum=1;
	printf("\nEnter x: ");
	scanf("%d",&x);
	printf("\nEnter n: ");
	scanf("%d",&n);
	for(i=0;i<=n;i++)
	{
		sum=1;
		sum=sum+pow(x,i)/pow(2,i-1);
	}
	printf("\nFor x=%d and n=%d, the Sum of the series:\n 1 +x +x^2/2 +x^3/4 +... +x^n/2^(n-1)=%f",x,n,sum);
	return 0;	
}
