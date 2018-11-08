#include<stdio.h>
main()
{
	int i=0,m,n,j,a[20];
	scanf("%d",&n);
	m=n;
	while(m!=0)
	{
		a[i]=m%16;
		i++;
		m=m/16;
	}
	i--;
	for(j=i;j>=0;j--)
	{
		if(a[j]>9)
			printf("%c ",a[j]+55);
		else
			printf("%d ",a[j]);
	}
	
}
