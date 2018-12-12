#include<stdio.h>
void main()
{
	int a=2,b=3,c=0,lim,i,j;
	printf("\n enter the limit");
	scanf("%d",&lim);
	for(i=1;i<=lim;i++)
	{
		c=a+b;
		for(j=b+1;j<c;j++)
		{
			if(i>lim)break;
			printf("%5d",j);
			i++;
		}
		a=b;b=c;
	}
}
