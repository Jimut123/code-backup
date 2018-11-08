// fibonacci series

#include<stdio.h>
main()
{
	int i=0,j=1,s=0;
	for(i;s<20;)
	{
		printf("%d ",s);
		i=j;
		j=s;
		s=i+j;		
	}
}
