#include<stdio.h>

int main()
{
	int i=0,m=0;
	printf("%d %d %d %d %d %d",++i,++i,i++,i++,++i,++i);
	printf("\n");
	printf("%d %d\n",++m,++m);
	m = 0;
	printf("%d %d %d\n",m++,m++,m++);
	m = 0;
	printf("%d %d %d\n",m++,++m,m++);
	return 0;
}
