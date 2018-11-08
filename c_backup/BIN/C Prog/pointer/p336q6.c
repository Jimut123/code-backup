#include<stdio.h>
main()
{
	char arr[5],*p=arr;
	int i;
	for(i=4;i>0;i--)
	{
		*p++=i*i;
		p++;
	}
	for(i=4;i>=0;i--)
		printf("%d ",arr[i]);
}
