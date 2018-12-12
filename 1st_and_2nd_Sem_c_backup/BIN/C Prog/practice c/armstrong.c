#include<stdio.h>
int main()
{
	int n,temp,num=0;
	scanf("%d",&n);
	temp=n;
	while(temp!=0)
	{
		num=num+pow(temp%10,3);		
		temp=temp/10;
	}
	if(num==n)
		printf("armstrong");
	else
		printf("not armstrong");
		return 0;		
}
