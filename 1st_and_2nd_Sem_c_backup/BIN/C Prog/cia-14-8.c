#include<stdio.h>
main()
{
	int i=-3,j=2,k=0,m;
	m=++i&&++j||++k;
	printf("\n%d %d %d %d ",i,j,m,k);
}
