#include<stdio.h>
int fact(int);
int main()
{
	int i,x,n;
	float sum=0;
	printf("\nEnter x and n subsequently: ");
	scanf("%d %d",&x,&n);
	sum=0;
	for(i=0;i<=n;i++)
	{
		sum=sum+pow(x,i)/fact(i); 
	}
	printf("\nRequired sum:%f",sum);
	return 0;
}
int fact(int j)
{
	int mul=1;
	for(j=1;i>=j;i--)
	{
		mul=mul*i;	
	}		
	return mul;
}
