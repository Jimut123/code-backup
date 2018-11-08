// fibonacci series

#include<stdio.h>
#define x 30

main()
{
	int i=0,j=1,k,s=0,s1;
	while(s<x)
	{		
		//printf("%d ",s);
		i=j;
		j=s;
		s=i+j;
		s1=s+j;
		for(k=s+1;k<s1;k++)
		if(k<x)
		printf("%d ",k);	
	}
}
