
	/* Assignment 3 .... Question 13 */
	/* Checking whether a matrix is an Identity Matrix or not */

#include<stdio.h>
#include<math.h>

int main()
{
	int i,j,n,a[10][10],flag=0;
//	clrscr();
	printf("\n\nEnter the degree of the matrix : ");
	scanf("%d",&n);
	printf("\n\n");
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			printf("Enter number a[%d][%d] : ",i,j);
			scanf("%d",&a[i][j]);
		}
		printf("\n");
	}

	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			if(i==j)
			{
				if(a[i][j]!=1)
				{
					flag=1;
					break;
				}
			}
			else
			{
				if(a[i][j]!=0)
				{
					flag=1;
					break;
				}
			}
		}
	}

		/* Printing the matrix */

//	clrscr();
	printf("\n\nThe input matrix is as follows .... \n\n");
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			printf("%4d",a[i][j]);
		}
		printf("\n");
	}


		if(flag==1)
			printf("\n\nThe matrix is not an Identity Matrix");
		else
			printf("\n\nThe matrix is an Identity Matrix");

	//getch();
}
