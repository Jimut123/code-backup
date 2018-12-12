
	/* Assignment 3 .... Question 5 */
	/* Division & Rank problem */

#include<stdio.h>

struct student
{
	char name[20];
	int roll;
	int marks1;
	int marks2;
	int marks3;
	int total;
	int division;
	int rank;
};

void main()
{
	int i=0,j,n;
	char ans='Y';
	struct student std[10],temp;
	clrscr();

	do
	{
		printf("\nEnter Student's name : ");
		fflush(stdin);
		gets(std[i].name);
		printf("\nEnter Student's roll : ");
		scanf("%d",&std[i].roll);
		printf("\nEnter Student's marks in physics : ");
		scanf("%d",&std[i].marks1);
		printf("\nEnter Student's marks in chemistry : ");
		scanf("%d",&std[i].marks2);
		printf("\nEnter Student's marks in mathematics : ");
		scanf("%d",&std[i].marks3);
		std[i].total=std[i].marks1+std[i].marks2+std[i].marks3;
		if (std[i].total/3>=60)
			std[i].division=1;
		if (std[i].total/3>=45 && std[i].total/3<60)
			std[i].division=2;
		if (std[i].total/3>=34 && std[i].total/3<45)
			std[i].division=3;
		if (std[i].total/3<34)
			std[i].division=0;
		i++;
		printf("\nDo you want to continue....(y/n)? : ");
		ans=getch();
		printf("\n");
	}
	while (ans=='Y' || ans=='y');

	n=i;
	clrscr();
	printf("\n\nThe total number of students is : %d\n\n",n);
	getch();
	printf("\nThe original array is as follows....\n");
	for (i=0;i<n;i++)
	{
		printf("\nStudent's name : %s",std[i].name);
		printf("\nStudent's roll : %d",std[i].roll);
		printf("\nStudent's marks in physics : %d",std[i].marks1);
		printf("\nStudent's marks in chemistry : %d",std[i].marks2);
		printf("\nStudent's marks in mathematics : %d",std[i].marks3);
		printf("\nStudent's total : %d",std[i].total);
		printf("\nStudent's division : %d",std[i].division);
		printf("\n");
		getch();
	}

		/* Sorting starts here */

	for (i=0;i<n-1;i++)
	{
		for (j=i+1;j<n;j++)
		{
			if (std[i].total < std[j].total)
			{
				temp=std[i];
				std[i]=std[j];
				std[j]=temp;
			}
		}
	}

		/* Output starts here */

	clrscr();
	printf("\n\nAfter sorting the output is as follows....\n\n");
	getch();
	for (i=0;i<n;i++)
	{
		printf("\nStudent's name : %s",std[i].name);
		printf("\nStudent's roll : %d",std[i].roll);
		printf("\nStudent's marks in physics : %d",std[i].marks1);
		printf("\nStudent's marks in chemistry : %d",std[i].marks2);
		printf("\nStudent's marks in mathematics : %d",std[i].marks3);
		printf("\nStudent's total : %d",std[i].total);
		printf("\nStudent's division : %d",std[i].division);
		if (std[i].total!=std[i-1].total)
			std[i].rank=i+1;
		else
			std[i].rank=std[i-1].rank;
		printf("\nStudent's rank : %d",std[i].rank);

		printf("\n");
		getch();
	}

	/* Final output of the program in tabular form */

	clrscr();
	printf("\n\tRoll Number     Total Marks      Division         Rank");
	printf("\n\t======================================================");
	printf("\n");
	for (i=0;i<n;i++)
	{
		printf("\n\t%7d       %10d    %10d    %10d",std[i].roll,std[i].total,std[i].division,std[i].rank);
	}
	getch();

	/* Program ends here */
}
