#include<stdio.h>
int main()
{
	int num[6] = {24,34,12,44,56,17};
	int i;
	for(i=0;i<=5;i++)
	{
		printf("\n address = %u",&num[i]);
		printf("\n element = %d%d",num[i],*(num+i));
		printf("%d",*(num+i));
	}
	return 0;
}
