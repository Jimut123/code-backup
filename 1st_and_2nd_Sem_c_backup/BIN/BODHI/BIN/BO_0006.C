/*
***0006***
Merge Sort
*/

#include<stdio.h>



int main()
{
	int n=10;
	int a[10]={98,27,75,69,78,44,40,95,88,33}, i;
	void quicksort(int[],int,int);

	clrscr();

	/*
	printf("\nARRAY CREATION");
	for(i=0; i<n; i++)
	{
		printf("\nEnter element no. %d :: ",(i+1));
		scanf("%d", &a[i]);
	}
	*/

	printf("\nTHE ORIGINAL ARRAY :\n ");
	for(i=0;i<n;i++)
		printf("%d ",a[i]);

	quicksort(a,0,n-1);

	printf("\nTHE SORTED ARRAY :\n ");
	for(i=0;i<n;i++)
		printf("%d ",a[i]);

	getch();
	return;
}

void quicksort(int a[],int low,int high)
{
	int p,partition(int [],int,int);
	if(low<high)
	{
		p=partition(a,low,high);
		quicksort(a,low,p-1);
		quicksort(a,p+1,high);
	}
}

int partition(int a[],int l,int u)
{
	int pivot=a[0]; int tmp, down=l,up=u;
	while(down<up)
	{
		while(a[down]<=pivot)
			down++;
		while(a[up]>pivot)
			up--;
		if(down<up)
		{
			tmp=a[down];
			a[down]=a[up];
			a[up]=tmp;
		}
	}
	a[0]=a[up];
	a[up]=pivot;
	return u;
}