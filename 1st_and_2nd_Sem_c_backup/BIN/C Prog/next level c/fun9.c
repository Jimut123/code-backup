#include<stdio.h>
main()
{
	int i=0,m,n,j,a[20];
	scanf("%d",&n);
	m=n;
	while(m!=0)
	{
		a[i]=m%8;
		i++;
		m=m/8;
	}
	i--;
	for(j=i;j>=0;j--)
	{
		printf("%d ",a[j]);
	}
	
}
