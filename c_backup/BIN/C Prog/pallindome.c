#include<stdio.h>
int main()
{
	int i,pal,num,sum=0;

	{
		pal=num%10;
		num=num/10;
		sum=(sum*10)+pal;
	}
	return 0;
}
