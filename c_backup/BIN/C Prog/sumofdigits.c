// determining the sum of digits
#include<stdio.h>
int main()
{
	int i=243,j,sum=0;
	while(i!=0)
	{
		j=i%10;
		i=i/10;
		printf("%d",j);
		//sum=sum+j;
		//if(i!=0)
		//printf(" + ");		
	}
	//printf(" = %d",sum);
	return 0;
}
