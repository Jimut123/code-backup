
	/* Assignment 3 .... Question 2 */
	/* To calculate the frequency of 20 numbers */

#include<stdio.h>

/* defining value of N to 20 */
#define N 20

void main()
{
	int ch,i,arr[20],fr,fl,freq(),flag();	/* Declarations */
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
		printf("1. To print the frequency of numbers");
		gotoxy(10,12);
		printf("2. Exit from program");
		gotoxy(10,16);
		printf("Enter your choice (1,2) : ");
		scanf("%d",&ch);

		switch(ch)
		{
			case 1:	clrscr();
				printf("\n");
				printf("\t\t|-------------------------------------|\n");
				printf("\t\t|         NUMBER     FREQUENCY        |\n");
				printf("\t\t|-------------------------------------|\n");
				for(i=0;i<N;i++)
				{
					fr=freq(arr,N,arr[i]);
					fl=flag(arr,i,arr[i]);
					if (fl==0)
					printf("\t\t|         %4d        %4d            |\n",arr[i],fr);
				}
				printf("\t\t|-------------------------------------|\n");

				getch();
				break;
			case 2: clrscr();
				gotoxy(10,10);
				printf("Exiting from program....");
				sleep(1);
				exit();
		}
	}
	while (1);
}

int freq(int a[],int n,int no)
{
	int i,fr=0;
	for (i=0;i<n;i++)
		if (a[i]==no)
			fr++;
	return fr;
}

int flag(int a[],int ni,int no)
{
	int i,fl=0;
	for (i=0;i<ni;i++)
		if (a[i]==no)
			fl=1;
	return fl;
}
