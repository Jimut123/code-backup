#include<stdio.h>
int main()
{
	int i,n,flag=0;
	printf("\nEnter your number: ");
	scanf("%d",&n);
	for(i=2;i<=n/2;i++)
	{
		if(n%2==0)
	{
		flag=1;
		break;
	}
	}
	if(flag==0)
		printf("prime...");
	else
		printf("composite...");
	return 0;
}
