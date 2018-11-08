
	/* Assignment 3 .... Question 1 */
	/* Menu driven program to calculate the following ....

		i) Sum of 20 numbers (s)
	       ii) Average of 20 numbers (avg)
	      iii) Maximum number (num)
	       iv) Standard Deviation (sd)	*/

#include<stdio.h>
#include<math.h>

/* defining value of N to 20 */
#define N 20

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
		printf("1. Sum of 20 numbers");
		gotoxy(10,11);
		printf("2. Average of 20 numbers");
		gotoxy(10,12);
		printf("3. Maximum of 20 numbers");
		gotoxy(10,13);
		printf("4. Standard Deviation of 20 numbers");
		gotoxy(10,14);
		printf("5. Exit from program");
		gotoxy(10,16);
		printf("Enter your choice (1,2,3,4,5) : ");
		scanf("%d",&ch);

		switch(ch)
		{
			case 1:	s=sum(arr,N);
				clrscr();
				gotoxy(10,10);
				printf("Sum of the numbers is : %d",s);
				getch();
				break;
			case 2:	a=avg(arr,N);
				clrscr();
				gotoxy(10,10);
				printf("Average of the numbers is : %f",a);
				getch();
				break;
			case 3:	m=max(arr,N);
				clrscr();
				gotoxy(10,10);
				printf("Maximum of the numbers is : %d",m);
				getch();
				break;
			case 4:	d=sd(arr,N);
				clrscr();
				gotoxy(10,10);
				printf("Standard Deviation of the numbers is : %f",d);
				getch();
				break;
			case 5: clrscr();
				gotoxy(10,10);
				printf("Exiting from program....");
				sleep(1);
				exit();
		}
	}
	while (1);
}

int sum(int a[],int n)
{
	int i,sum=0;
	for (i=0;i<n;i++)
		sum+=a[i];
	return sum;
}

float avg(int a[],int n)
{
	int i,sum=0;
	float avg;
	for (i=0;i<n;i++)
		sum+=a[i];
	avg=sum/(float)n;
	return avg;
}

int max(int a[],int n)
{
	int i,maxm;
	maxm=a[0];
	for (i=1;i<n;i++)
		if (maxm<a[i])
			maxm=a[i];
	return maxm;
}

float sd(int a[],int n)
{
	int i,sum=0;
	float avg,sdev=0;
	for (i=0;i<n;i++)
		sum+=a[i];
	avg=sum/(float)n;
	for (i=0;i<n;i++)
		sdev+=(a[i]-avg)*(a[i]-avg);
	sdev=sqrt(sdev/(float)n);
	return sdev;
}
