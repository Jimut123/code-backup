#include<stdio.h>
int main()
{
	int i,j,k,l,c=1;
	for(i=1;i<=4;i++)
	{
		for(j=i;j<4;j++)
			printf(" ");
		for(k=1;k<=i;k++)
			printf("%d",c++);
		c--;
		for(l=1;l<i;l++)
			printf("%d",--c);
		printf("\n");
	}
	return 0;
}
