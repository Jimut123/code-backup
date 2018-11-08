#include"stdio.h"
#include"conio.h"
void merge(int*,int,int,int);
void mergesort(int*,int,int);
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
	mergesort(a,0,n-1);
	for(i=0;i<n;i++)
	{
		printf("\n data after sort:");
		printf("\n %d:",a[i]);

	}
}
void mergesort(int*a,int left,int right)
{
	int m=(left+right)/2;
	if(left<right)
	{
       
      mergesort(a,left,m);
      mergesort(a,m+1,right);
	  merge(a,left,m,right);
	}
}
void merge(int*a,int left,int m,int right)
{
 int t[100];
	int p=0;
	int lf=left;
	int rf=m+1;
	int i;
	while(lf<=m && rf<=right)
	{
		if(a[lf]< a[rf])
		{
			t[p++]=a[lf++];
		}
		else
		{
            t[p++]=a[rf++];
		}
	}
	while(lf<=m)
	{
         t[p++]=a[lf++];
	}
	while(rf<=right)
	{
         t[p++]=a[rf++];
	}
	for(i=0;i<p;i++)
	{
		a[i+left]=t[i];
	}
	return;

}



