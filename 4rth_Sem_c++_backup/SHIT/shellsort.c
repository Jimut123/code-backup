#include"stdio.h"
#include"conio.h"
void shellsort(int a[],int);
void main()
{
	int i,n;
	int a[100];
	printf("\n Enter term:");
	scanf("%d",&n);
	
	for(i=0;i<n;i++)
	{
		printf("\n Enter data:");
		scanf("%d",&a[i]);
	}
	for(i=0;i<n;i++)
	{
		printf("\n data before sort:");
		printf("\n %d:",a[i]);

	}
	shellsort(a,n);
	for(i=0;i<n;i++)
	{
		printf("\n data after sort:");
		printf("\n %d:",a[i]);

	}
}
void shellsort(int a[],int n)
{
	int i,j,k,temp;
	for(i=n/2;i>0;i=i/2)
	{
		for(j=i;j<n;j++)
		{
			for(k=j-i;k>=0;k=k-i)
			{
				if(a[k+i]>=a[k])
					break;
				else
				{
					temp=a[k];
					a[k]=a[k+i];
					a[k+i]=temp;
				}
			}
		}
	}
	
}




