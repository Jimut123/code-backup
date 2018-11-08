#include<stdio.h>
int main()
{
	int i,j;
	int a[5][5];
		for(i=0;i<5;i++)
	{
		for(j=0;j<=i;j++)
		{
			
			if(a[i][j]=a[i-1][j-1]+a[i-1][j])
				{
				printf("%4d",a[i][j]);	
				printf("\n");
				}
			else if(i==j)
			{
				printf("1\n");
			}
				
		}
	}
	return 0;
}
