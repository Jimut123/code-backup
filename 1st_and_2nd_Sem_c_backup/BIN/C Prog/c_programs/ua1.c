#include<stdio.h>
int main()
{
	int i,j,n;
	float sum=0;
	printf("\nNo of terms: ");
	scanf("%d",&n);
	sum=0;
	for(i=1;i<=n;i++)
	{
		for(j=2;j<=(i+1);j++)
		sum=sum+i/j;
	}
	printf("\nPrint sum:%f",sum);
	return 0;
}
