#include"stdio.h"
int search(int a[],int,int,int);
void main()
{
	int n,a[100],i,key,pos,j,k;
	//clrscr();
	printf("\n Enter number of term:");
	scanf("%d",&n);
	printf("\n Enter elements:");
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);
	//sorting
	for(i=0;i<n-1;i++)
	{
      for(j=i+1;j<n;j++)
	{
		  if(a[i]>a[j])
		  {
			  k=a[i];
			  a[i]=a[j];
			  a[j]=k;
		  }
	  }
	}
	printf("\n Enter searching element:");
	scanf("%d",&key);
	pos=search(&a[0],0,n-1,key);
	if(pos==-1)
		printf("\n not found....");
	else
		printf("\n found...");
	//getch();
}
int search(int a[],int low,int high,int key)
{
int mid;
while(low<=high)
{
	mid=low+(high-low)*((key-a[low])/(a[high]-a[low]));
	if(key==a[mid])
		return mid+1;
	if(key<a[mid])
		high=mid-1;
	else
        low=mid+1;
}
return -1;
}
