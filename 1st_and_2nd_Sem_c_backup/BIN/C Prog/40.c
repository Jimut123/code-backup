#include<stdio.h>
int main()
{
	int i,n,sum=0;
	printf("Enter the numbers to be summed:");
	scanf("%d", &n);
	for(i=1;i<=n;i++)
	{
		sum+=i;
		
	}
	printf("Sum is :%d",sum);
	return 0;
}
