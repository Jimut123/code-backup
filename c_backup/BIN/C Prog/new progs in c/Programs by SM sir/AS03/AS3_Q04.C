
	/* Assignment 3 .... Question 4 */
	/* To print ....

		Identity matrix
		Diagonal Unit matrix
		Pascal's Triangle 		*/

#include<stdio.h>

/* defining value of N to 4 */
#define N 4

void identity();
void diagonal_unit();
void pascal_triangle();

void main()
{
	int ch,i,j,r,c,a[N][N];		/* Declarations */
	clrscr();

		/* Menu driven program starts */

	do
	{
		clrscr();
		gotoxy(10,10);
		printf("1. To print Identity matrix");
		gotoxy(10,11);
		printf("2. To print Diagonal Unit matrix");
		gotoxy(10,12);
		printf("3. To print Pascal's Triangle");
		gotoxy(10,13);
		printf("4. Exit from program");
		gotoxy(10,16);
		printf("Enter your choice (1,2,3,4) : ");
		scanf("%d",&ch);

		switch(ch)
		{
			case 1:	clrscr();
				identity();
				getch();
				break;
			case 2:	clrscr();
				diagonal_unit();
				getch();
				break;
			case 3:	clrscr();
				pascal_triangle();
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

void identity()
{
	int i,j,a[N][N];
	gotoxy(10,10);
	printf("The Identity matrix is as follows....\n\n\t\t");
	for (i=0;i<N;i++)
	{
		for (j=0;j<N;j++)
		{
			if (i==j)
			{
				a[i][j]=1;
				printf("%4d",a[i][j]);
			}
			else
			{
				a[i][j]=0;
				printf("%4d",a[i][j]);
			}
		}
		printf("\n\n\t\t");
	}
}

void diagonal_unit()
{
	int i,j,a[N][N];
	gotoxy(10,10);
	printf("The Diagonal Unit matrix is as follows....\n\n\t\t");
	for (i=0;i<N;i++)
	{
		for (j=0;j<N;j++)
		{
			if (i==j || j==N-i-1)
			{
				a[i][j]=1;
				printf("%4d",a[i][j]);
			}
			else
			{
				a[i][j]=0;
				printf("%4d",a[i][j]);
			}
		}
		printf("\n\n\t\t");
	}
}

void pascal_triangle()
{
	int i,j,a[N+2][N+2];
	gotoxy(10,10);
	printf("The Pascal's Triangle is as follows....\n\n\t\t");
	for (i=0;i<N+2;i++)
	{
		for (j=0;j<=i;j++)
		{
			if (i==j || j==0)
			{
				a[i][j]=1;
				printf("%4d",a[i][j]);
			}
			else
			{
				a[i][j]=a[i-1][j-1]+a[i-1][j];
				printf("%4d",a[i][j]);
			}
		}
		printf("\n\n\t\t");
	}
}
