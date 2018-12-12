#include<stdio.h>
void main()
{
	int i,j;
	for(i=1;i<=5;i++)
		{
			for(j=1;j>=5;--j);
			printf("%3d",j);
			printf("\n");
		}
	getch();
}
