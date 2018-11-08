#include<stdio.h>
main()
{
	int n,i,j,a[100];
	scanf("%d",&n);
	a[0]=1;
	a[1]=1;
	for(i=n-1;i<=n-1;i++)
	{
		a[i]=a[i-1]+a[i-n-1];
	}
	for(i=0;i<=n-1;i++)
	{
		printf("%d ",a[i]);
	}
	
}
