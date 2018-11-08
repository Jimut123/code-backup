#include<stdio.h>
int main()
{
	int i,j,n;
	printf("\n Enter Number:");
	scanf("%d",&n);
	for(i=2;i<=n/i;i++)
	if(n%i==0)
		break;
	if(i>=n/i)	
		printf("The Number is Prime");
	else
		printf("The Number is not Prime, i.e.,Composite");
	return 0;
}
