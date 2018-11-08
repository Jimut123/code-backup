#include<stdio.h>
int main()
/*{
	int i,j;
	int a[3][3]={1,2,3,2,3,4,4,5,6};
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		printf("%4d",a[i][j]);
		printf("\n");
	}
	return 0;
}*/
/*{
	int i,j,a[5][5];
	for(i=0;i<5;i++)
	{
		for(j=0;j<=i;j++)
		{
			if(i==0||j==i)
			a[i][j]=1;
			else
			a[i][j]=a[i-1][j]+a[i-1][j-1];
		}
	}
	for
	return 0;
	}*/
/*	{
		int i,j;
		int a[5][5];
		for(i=0;i<5;i++)
		{
			for(j=0;j<=i;j++)
			{
				printf("%4d",a[i][j]);
				printf("\n");				
			}
		}
		return 0;
	}*/
/*{
	int i,j,k;
	for(i=0;i<5;i++)
	{
		j=pow(11,i);
		printf("%5d",j);
		printf("\n");	
	}	
	return 0;
}*/
{
	int i,j;
	int a[5][5];
		for(i=0;i<5;i++)
	{
		for(j=0;j<=i;j++)
		{
			
			if(a[i][j]=a[i-1][j-1]+a[i-1][j+1])
				{
				printf("%4d",a[i][j]);	
				printf("\n");
				}
			else if(i==j)
			{
				printf("%4d");
				
		}
	}
	return 0;
}
