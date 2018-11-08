#include<stdio.h>
int main()
{
	int a=0,b=1,c=0;
	printf("%d %d",a,b);
	for(a=1;a<=20;a++);
	{
		c=a+b;
		a=b;
		b=c;
		printf("%d",c);
	
	}
	return 0;
}
