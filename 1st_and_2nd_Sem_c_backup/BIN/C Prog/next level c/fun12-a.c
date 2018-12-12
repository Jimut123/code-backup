#include<stdio.h>
main()
{
	int i,j,n,a[100][100],sum=0;
	scanf("%d",&n);
	for(i=0;i<=n-1;i++)
		for(j=0;j<=n-1;j++)
			scanf("%d",&a[i][j]);
	
	
	
	for(i=0;i<=n-1;i++)
	{
		for(j=0;j<=n-1;j++)
			printf("%d\t",a[i][j]);
			printf("\n");
	}
	
	
	/*for(i=0;i<=n-1;i++)
		for(j=0;j<=n-1;j++)
			if(i==j)
				sum=sum+a[i][j];
	
	printf("sum=%d",sum);	*/
	
	for(i=0;i<=n-1;i++)
	{
		for(j=0;j<=n-1;j++)
			sum=sum+a[i][j];
		//	printf("Sum=%d ",sum);
		//	sum=0;
	}
	printf("Sum=%d ",sum);
	sum=0;
	
	for(i=0;i<=n-1;i++)
	{
		for(j=n-1;j>=0;j--)
		if((i+j)==n-1)
			sum=sum+a[i][j];
	}
	printf("sum=%d",sum);
}
