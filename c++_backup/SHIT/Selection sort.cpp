#include<stdio.h>
void main()
{
	int n,pos,i,j,k=0,a[100];
	printf("Enter the term/n");
	scanf("%d",&n);
	printf("Enter the array elements");
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	for(i=0;i<n-1;i++)
	{
		pos=i;
	    for(j=i+1;j<n;j++)
        {
			if(a[j]<a[pos])
			{
			     pos=j;
			}
		}
		k=a[i];
		a[i]=a[pos];
		a[pos]=k;
	}
	for(i=0;i<n;i++)
		printf("\n %d",a[i]);
	    
}
