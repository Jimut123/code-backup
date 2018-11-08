#include<stdio.h>
int main()
{
	int s,i,j;
	for(i=1;i<=100;i++)
	{
		s=i+j;
		i=j;
		j=s;
		printf("\t%d",s);
	}
	return 0;
}
