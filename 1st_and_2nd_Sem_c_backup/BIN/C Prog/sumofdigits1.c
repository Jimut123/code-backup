// determining the sum of digits
#include<stdio.h>
int main()
{
	int i=243,j,sum=0;
	while(i!=0)
	{
		j=i%10;
		printf("%d",j);
		i=i/10;
	}
		sum=j+i;
		printf("%d",sum);
		return 0;
	
}
