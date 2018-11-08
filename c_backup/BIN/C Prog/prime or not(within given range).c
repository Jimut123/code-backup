#include<stdio.h>
main()
{
	int i,j,n,k,a,b;
	scanf("%d %d ",&a,&b);
	for(j=a;j<=b;j++)
	{
		for(i=2;i<n;i++)
	{
		k=n%i;
		if(k==0)
		{
			exit (0);
		}
	}
	printf("%d",j);
	}
}
