
	/* Assignment 3 .... Question 3 */
	/* To calculate ....

		Sum of 2 square matrices
		Difference of 2 matrices
		Product of 2 matrices 		*/

#include<stdio.h>

/* defining value of N to 3 */
#define N 3

void add();
void subtract();
void multiply();
void show_ab();

void main()
{
	int ch,i,j,r,c,a[N][N],b[N][N];	/* Declarations */
	clrscr();

		/* Input module starts */

	c=10;
	r=5;
	gotoxy(c,r);
	printf("Enter the 1st matrix ....");
	r=r+1;
	for (i=0;i<N;i++)
	{
	    r=r+1;
	    c=10;
	    gotoxy(c,r);
	    c=c+15;
	    printf("Enter row %d : ",i+1);
		for (j=0;j<N;j++)
		{
			gotoxy(c,r);
			scanf("%d",&a[i][j]);
			c=c+5;
		}
	}

	c=10;
	r=r+4;
	gotoxy(c,r);
	printf("Enter the 2nd matrix ....");
	r=r+1;
	for (i=0;i<N;i++)
	{
	    r=r+1;
	    c=10;
	    gotoxy(c,r);
	    c=c+15;
	    printf("Enter row %d : ",i+1);
		for (j=0;j<N;j++)
		{
			gotoxy(c,r);
			scanf("%d",&b[i][j]);
			c=c+5;
		}
	}

		/* Menu driven program starts */

	do
	{
		clrscr();
		gotoxy(10,10);
		printf("1. To print summation of matrices");
		gotoxy(10,11);
		printf("2. To print difference of matrices");
		gotoxy(10,12);
		printf("3. To print product of matrices");
		gotoxy(10,13);
		printf("4. Exit from program");
		gotoxy(10,16);
		printf("Enter your choice (1,2,3,4) : ");
		scanf("%d",&ch);

		switch(ch)
		{
			case 1:	clrscr();
				add(a,b,N);
				getch();
				break;
			case 2:	clrscr();
				subtract(a,b,N);
				getch();
				break;
			case 3:	clrscr();
				multiply(a,b,N);
				getch();
				break;
			case 4: clrscr();
				gotoxy(10,10);
				printf("Exiting from program....");
				sleep(1);
				exit();
		}
	}
	while (1);
}

void add(int a[N][N],int b[N][N], int n)
{
	int i,j,sum[N][N];
	show_ab(a,b,n);
	gotoxy(10,20);
	printf("The summation matrix is as follows....\n\n");
	for (i=0;i<n;i++)
	{
		for (j=0;j<n;j++)
		{
			sum[i][j]=a[i][j]+b[i][j];
			printf("\t\t%d",sum[i][j]);
		}
		printf("\n");
	}
}

void subtract(int a[N][N],int b[N][N], int n)
{
	int i,j,diff[N][N];
	show_ab(a,b,n);
	gotoxy(10,20);
	printf("The difference matrix is as follows....\n\n");
	for (i=0;i<n;i++)
	{
		for (j=0;j<n;j++)
		{
			diff[i][j]=a[i][j]-b[i][j];
			printf("\t\t%d",diff[i][j]);
		}
		printf("\n");
	}
}

void multiply(int a[N][N],int b[N][N], int n)
{
	int i,j,k,prod[N][N];
	show_ab(a,b,n);
	gotoxy(10,20);
	printf("The product matrix is as follows....\n\n");
	for (i=0;i<n;i++)
	{
		for (j=0;j<n;j++)
		{
			prod[i][j]=0;
			for (k=0;k<n;k++)
			{
				prod[i][j]=prod[i][j]+a[i][k]*b[k][j];
			}
			printf("\t\t%d",prod[i][j]);
		}
		printf("\n");
	}
}

void show_ab(int a[N][N],int b[N][N], int n)
{
	int i,j;
	gotoxy(10,2);
	printf("The Matrix A is as follows....\n\n");
	for (i=0;i<n;i++)
	{
		for (j=0;j<n;j++)
		{
			printf("\t\t%d",a[i][j]);
		}
		printf("\n");
	}
	gotoxy(10,10);
	printf("The Matrix B is as follows....\n\n");
	for (i=0;i<n;i++)
	{
		for (j=0;j<n;j++)
		{
			printf("\t\t%d",b[i][j]);
		}
		printf("\n");
	}
}
