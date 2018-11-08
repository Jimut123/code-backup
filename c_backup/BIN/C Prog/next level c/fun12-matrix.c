#include<stdio.h>
/*main()
{
	int i,j,a[3][3];
	for(i=0;i<=n-1;i++)
	{
		for(j=0;j<=n-1;j++)
			scanf("%d",&a[i][j]);
	}
		for(i=0;i<=n-1;i++)
	{
		for(j=0;j<=n-1;j++)
			printf("%d\t",a[i][j]);
			printf("\n");
	}
}*/

main()
{
	int i,j,a[3][3],b[3][3],c[3][3];
	for(i=0;i<=n-1;i++)
	{
		for(j=0;j<=n-1;j++)
			scanf("%d",&a[i][j]);
	}
		for(i=0;i<=n-1;i++)
	{
		for(j=0;j<=n-1;j++)
			printf("%d\t",a[i][j]);
			printf("\n");
	}
	
	for(i=0;i<=n-1;i++)
	{
		for(j=0;j<=n-1;j++)
			scanf("%d",&b[i][j]);
	}
		for(i=0;i<=n-1;i++)
	{
		for(j=0;j<=n-1;j++)
			printf("%d\t",b[i][j]);
			printf("\n");
	}
	
	
	for(i=0;i<=n-1;i++)
	{
		for(j=0;j<=n-1;j++)
		
			c[i][j]=a[i][j]+b[i][j];
		
	}
	
	for(i=0;i<=n-1;i++)
	{
		for(j=0;j<=n-1;j++)
			printf("%5d \t",c[i][j]);
		printf("\n");
	}
	
}
