#include<stdio.h>

main()
{
	int i,x,p=1;
	
	printf("Enter The no. To Which Factorial is to be applied :- ");
	scanf("%d",&x);
	
	for(i=1;x>=i;x--)
	
	p=p*x;
	printf("the factorial is %d ",p);
	
}
