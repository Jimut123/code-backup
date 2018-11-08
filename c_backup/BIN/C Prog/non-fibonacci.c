#include<stdio.h>


int main()
{
	int n,a,b,c,x,d;

	a=0;
	b=1;
	c=0;
	printf("Enter the upper range of the series:");
	scanf("%d",&n);

	while(c<=n)
	{
		c=a+b;
		a=b;
		b=c;
		d=a+b;

		for(x=c+1;x<d;x++)
		{
			if(x<=n)
				printf("%d\t",x);
			else
				break;
		}
	}
	return 0;
}
