#include<stdio.h>
int main()
{
	int i,s=0;
	
	for(i=1;i<=15;i++)
	
	{
		if(i==5 || i==7)
		continue;
		s=s+i;
		printf("%d+",i);

	}
	printf("\b=%d",s);

	
	return 0;
}
