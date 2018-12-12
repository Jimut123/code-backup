#include<stdio.h>
main()
{
	int i,n,k,s;
	scanf("%d",&n);
	for(i=2;i<n;i++)
	{
		k=n%i;
		if(k==0)
		{
			printf("not prime",k);
			exit (0);
		}
	}
	printf("prime",k);
}
