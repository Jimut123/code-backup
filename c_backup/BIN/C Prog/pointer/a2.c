#include<stdio.h>
main()
{
	int val = 5;
	int *ptr=&val;
	printf("%lu\n",ptr);
	printf("%d %d ",val,*ptr++);
	printf("\n%lu",ptr);
}
