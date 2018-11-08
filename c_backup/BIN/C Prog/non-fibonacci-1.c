// non-fibonacci series

#include<stdio.h>
main()
{
	int i=0,j=1,s=0;

	for(i=0;s<20;)
	{
		i=j;
		j=s;
		s=i+j;	
		
	}
	if(!(s))
		printf("%d ",s);
	return 0;
}
