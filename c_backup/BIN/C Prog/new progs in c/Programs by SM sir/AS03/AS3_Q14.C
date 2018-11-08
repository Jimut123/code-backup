
	/* Assignment 3 .... Question 14 */
	/* Symmetric Difference of two sets */

#include<stdio.h>
#include<math.h>

void main()
{
	int i,j,k,n1,n2,flag,a[10],b[10],c[10];

		/* Input module starts */

	clrscr();
	gotoxy(10,10);
	printf("Enter the number of elements you want in set A : ");
	scanf("%d",&n1);
	for(i=0;i<n1;i++)
	{
		printf("\n\tEnter number %d : ",i+1);
		scanf("%d",&a[i]);
	}

	clrscr();
	gotoxy(10,10);
	printf("Enter the number of elements you want in set B : ");
	scanf("%d",&n2);
	for(i=0;i<n2;i++)
	{
		printf("\n\tEnter number %d : ",i+1);
		scanf("%d",&b[i]);
	}

		/* Symmetric Difference program starts */

	k=0;

		/* Copying uncommon elements from set A */

	for(i=0;i<n1;i++)
	{
		flag=0;
		for(j=0;j<n2;j++)
		{
			if(a[i]==b[j])
			{
				flag=1;
				break;
			}
		}
		if (flag==0)
		{
			c[k]=a[i];
			k++;
		}
	}

		/* Copying uncommon elements from set B */

	for(i=0;i<n2;i++)
	{
		flag=0;
		for(j=0;j<n1;j++)
		{
			if(b[i]==a[j])
			{
				flag=1;
				break;
			}
		}
		if (flag==0)
		{
			c[k]=b[i];
			k++;
		}
	}

	clrscr();

	gotoxy(10,5);
	printf("The elements of set A are as follows....");
	printf("\n\n\t\t");
	for (i=0;i<n1;i++)
		printf("%4d",a[i]);

	gotoxy(10,10);
	printf("The elements of set B are as follows....");
	printf("\n\n\t\t");
	for (i=0;i<n2;i++)
		printf("%4d",b[i]);

	gotoxy(10,15);
	printf("The Symmetric Difference elements of the sets A & B are as follows....");
	printf("\n\n\t\t");
	for(i=0;i<k;i++)
		printf("%4d",c[i]);
	getch();
}
