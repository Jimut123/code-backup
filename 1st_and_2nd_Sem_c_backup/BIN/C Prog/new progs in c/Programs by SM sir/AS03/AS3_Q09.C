
	/* Assignment 3 .... Question 9 */
	/* Sorting & Searching techniques */

	/* Menu driven program to sort & search an array ....

		1) Sorting
		2) Searching

		Sorting Techniques ....

		i) Bubble Sort
	       ii) Selection Sort
	      iii) Insertion Sort
	       iv) 2 Way Merge Sort

		Searching Techniques ....

		i) Linear Search
	       ii) Binary Search		*/


#include<stdio.h>
#include<math.h>

/* Defining N to 5 */
#define N 5

void sorting();
void searching();
void bubble();
void selection();
void insertion();
void merge();
void min();
void linear();
void binary();
int binsearch();

void main()
{
	int ch,i,arr[20],s,m,sum(),max();	/* Declarations */
	float a,d,avg(),sd();
	clrscr();

		/* Input module starts */

	printf("\n\tEnter %d numbers one by one ....\n",N);
	for (i=0;i<N;i++)
	{
		printf("\tEnter number %d : ",i+1);
		scanf("%d",&arr[i]);
	}

		/* Menu driven program starts */

	do
	{
		clrscr();
		gotoxy(10,10);
		printf("1. Sorting of numbers");
		gotoxy(10,12);
		printf("2. Searching of numbers");
		gotoxy(10,14);
		printf("3. Exit from program");
		gotoxy(10,18);
		printf("Enter your choice (1,2,3) : ");
		scanf("%d",&ch);

		switch(ch)
		{
			case 1:	sorting(arr,N);
				break;
			case 2:	searching(arr,N);
				break;
			case 3: clrscr();
				gotoxy(10,10);
				printf("Exiting from program....");
				sleep(1);
				exit();
		}
	}
	while (1);
}

void sorting(int arr[N],int n)
{
		int ch;
		clrscr();
		gotoxy(10,10);
		printf("1. Bubble Sort");
		gotoxy(10,11);
		printf("2. Selection Sort");
		gotoxy(10,12);
		printf("3. Insertion Sort");
		gotoxy(10,13);
		printf("4. 2 Way Merge Sort");
		gotoxy(10,16);
		printf("Enter your choice (1,2,3,4) : ");
		scanf("%d",&ch);

		switch(ch)
		{
			case 1:	bubble(arr,n);
				break;
			case 2:	selection(arr,n);
				break;
			case 3:	insertion(arr,n);
				break;
			case 4:	merge(arr,n);
				break;
			case 5: clrscr();
				gotoxy(10,10);
				printf("Exiting from program....");
				sleep(1);
				exit();
		}
}

void bubble(int a[N],int n)
{
	int i,j,t;
	clrscr();
	printf("Unsorted List\n");
	for(i=0;i<n;i++)
		printf("a[%d]=%d\n",i,a[i]);

		 /*  Bubble Sort program starts */

	for(i=0;i<n-1;i++)
	{
		for(j=i+1;j<n;j++)
		{
			if (a[i]<a[j])
			{
				t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
		}
	}
	gotoxy(10,25);
	printf("Press any key to see Sorted results\n");
	getch();
	clrscr();
	printf("Sorted List\n");
	for(i=0;i<n;i++)
		printf("a[%d]=%d\n",i,a[i]);
	gotoxy(10,25);
	printf("Press return to finish");
	getch();
}

void selection(int a[N],int n)
{
	int i,small,temp,nrec=n;
	clrscr();
	printf("\nUnsorted List\n");
	for(i=0;i<nrec;i++)
		printf("a[%d]=%d\n",i,a[i]);

		/* Selection Sort program starts */

	for(i=0;i<n;i++)
	{
		small=i;
		min(i,n,&small,a);
		temp=a[small];
		a[small]=a[i];
		a[i]=temp;
	}

	printf("\nPress any key to see Sorted list..\n");
	getch();
	clrscr();
	printf("\nSorted List\n");
	for(i=0;i<nrec;i++)
		printf("a[%d]=%d\n",i,a[i]);
	gotoxy(10,25);
	printf("Press return to finish");
	getch();
}

		/* Function to Locate minimum number */

void min(int m, int n, int *loc, int x[])
{
	int i,small;
	small=x[m];
	for(i=m+1;i<n;i++)
		if(x[i]<small)
		{
			small=x[i];
			*loc=i;
		}
}

void insertion(int a[N],int n)
{
	int i,j,t;
	clrscr();
	printf("Unsorted List\n");
	for(i=0;i<n;i++)
		printf("a[%d]=%d\n",i,a[i]);

		 /*  Insertion Sort program starts */

	for(i=1;i<n;i++)
	{
		t=a[i];
		j=i-1;
		while(t<=a[j])
		{
			a[j+1]=a[j];
			j=j-1;
			if(j<0)
				break;
		}
		a[j+1]=t;
	}
	gotoxy(10,25);
	printf("Press any key to see Sorted results\n");
	getch();
	clrscr();
	printf("Sorted List\n");
	for(i=0;i<n;i++)
		printf("a[%d]=%d\n",i,a[i]);
	getch();
}

void merge(int x[N],int n)
{
	int i,j,k,ia,ib,size,ua,ub,aux[N];
	clrscr();
	printf("Unsorted List\n");
	for(i=0;i<n;i++)
		printf("a[%d]=%d\n",i,x[i]);
	gotoxy(10,25);
	printf("Press any key to see the Sorted List");
	getch();

	size=1;  /* Merge files of size 1 */

	while (size<n)
	{
		ia=0; /* Initialize lower bounds of first array */
		k=0; /* k is the index of the auxiliary array */

		while(ia+size < n)	/* To check if there are two arrays */
		{
			/* to merge */
			/* Calculation of remaining indices */

			ib=ia+size;
			ua=ib-1;
			if((ib+size-1) < n)
				ub=ib+size-1;
			else
				ub=n-1;

		/*  Merging two arrays to a single auxiliary array */

			for(i=ia,j=ib;i<=ua && j<=ub;k++)
			{
				if(x[i]<=x[j])
					aux[k]=x[i++];
				else
					aux[k]=x[j++];
			}

		/* Here any one sub-array will be exhausted and hence  */
		/* the remaining portion of the other file is to be copied */

			for( ;i<=ua;k++)
				aux[k]=x[i++];
			for( ;j<=ub;k++)
				aux[k]=x[j++];

		/*  Advance l1 to the start of the next pair of arrays1*/

			ia=ub+1;
		}

		   for(i=ia;i<n;i++)
			aux[k++]=x[i];

		   /*  To copy any single element to the auxiliary array */

		   for(i=ia;k<n;i++)
			aux[k++]=x[i];

		   /*  To copy back aux[] to x[] array and adjust the size */

		   for(i=0;i<n;i++)
			x[i]=aux[i];
		   size=size*2;
	}

	clrscr();
	printf("Sorted List\n");
	for(i=0;i<n;i++)
		printf("a[%d]=%d\n",i,x[i]);

	gotoxy(10,25);
	printf("Press any key to finish the program\n");
	getch();
}

void searching(int arr[N],int n)
{
		int ch;
		clrscr();
		gotoxy(10,10);
		printf("1. Linear Search");
		gotoxy(10,11);
		printf("2. Binary Search");
		gotoxy(10,16);
		printf("Enter your choice (1,2,3,4) : ");
		scanf("%d",&ch);

		switch(ch)
		{
			case 1:	linear(arr,n);
				break;
			case 2:	binary(arr,n);
				break;
			case 5: clrscr();
				gotoxy(10,10);
				printf("Exiting from program....");
				sleep(1);
				exit();
		}
}

void linear(int a[N],int n)
{
	int i,s,flag=0;
	clrscr();
	printf("\n\nEnter the element to be searched : ");
	scanf("%d",&s);
	for (i=0;i<n;i++)
		if (a[i]==s)
		{
			flag=1;
			break;
		}
	if (flag==1)
	{
		printf("\n\nNumber found ....");
		printf("\n\nThe location is = %d",i+1);
	}
	else
	{
		printf("\n\nNumber not found ....");
	}
	getch();
}

void binary(int a[N],int n)
{
	int m,r;
	clrscr();
	printf("\n\nEnter the element to be searched : ");
	scanf("%d",&m);
	r=binsearch(a,0,n,m);
	if (r>=0)
	{
		printf("\n\nNumber found ....");
		printf("\n\nThe location is = %d",r+1);
	}
	else
	{
		printf("\n\nNumber not found ....");
	}
	getch();
}

int binsearch(int b[],int p1,int p2,int s)
{
	int low=p1;
	int high=p2,mid;
	if(low>high)
		return(-1);
	mid=(low+high)/2;
	if(s<b[mid])
		binsearch(b,p1,mid-1,s);
	if(s>b[mid])
		binsearch(b,mid+1,p2,s);
	if(s==b[mid])
		return mid;
	return 0;
}
