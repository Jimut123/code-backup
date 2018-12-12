
	/**************************************************
	* Assignment 5 .... Question 3             	  *
	* Program to create a file with names & tel. nos. *
	* and to sort the file and display its contents	  *
	**************************************************/

typedef struct record	/* Creating the structure */
{
	char name[30];
	char tel[10];
}rec;

#include<stdio.h>

void main()
{
	rec r[20],temp;
	int i,j,n;
	char file1[20],file2[20],ans='Y';
	char reco[40];
	FILE *fp1,*fp2;
	clrscr();

	/* Entering the source file name */

	gotoxy(10,10);
	printf("Enter the file name you want to create : ");
	scanf(" %[^\n]",file1);

	/* Checking whether the source file is created or not */

	fp1=fopen(file1,"w");
	if (fp1==NULL)
	{
		gotoxy(10,20);
		printf("Source File cannot be created....");
		getch();
		exit();
	}

	gotoxy(10,15);
	printf("Enter the file name to store the sorted data : ");
	scanf(" %[^\n]",file2);

	/* Checking whether the sorted file is created or not */

	fp2=fopen(file2,"w");
	if (fp2==NULL)
	{
		gotoxy(10,20);
		printf("Sorted File cannot be created....");
		getch();
		exit();
	}

	/* Creating the source file */

	i=0;
	clrscr();
	gotoxy(10,5);
	printf("Enter the contents of the file....\n\n");
	do
	{
		printf("\tEnter the name : ");
		scanf(" %[^\n]",r[i].name);
		printf("\tEnter the telephone number : ");
		scanf(" %[^\n]",r[i].tel);
		fprintf(fp1,"%-30s%10s\n",r[i].name,r[i].tel);
		printf("\n\tDo you want to continue....(Y/N)? : ");
		ans=getch();
		printf("\n\n");
		i++;
	}
	while (toupper(ans)=='Y');
	n=i;
	gotoxy(10,20);
	printf("The total number of records is : %d",n);
	getch();
	fclose(fp1);

	fp1=fopen(file1,"r");
	fp2=fopen(file2,"w");

	/* Sorting the data */

	for (i=0;i<n-1;i++)
	{
		for (j=i+1;j<n;j++)
		{
			if (strcmp(r[i].tel,r[j].tel)>0)
			{
				temp=r[i];
				r[i]=r[j];
				r[j]=temp;
			}
		}
	}

	/* Writing the sorted data to the target file */

	for (i=0;i<n;i++)
		fprintf(fp2,"%-30s%10s\n",r[i].name,r[i].tel);
	fclose(fp2);

	/* Opening the Sorted file in read mode
	   and printing the Sorted Data on the screen */

	clrscr();
	gotoxy(10,10);
	printf("The contents of the Sorted file is as follows....\n\n");
	printf("\t%-30s%10s","Name of the Customer"," Telephone");
	printf("\n\t========================================\n\n");

	fp2=fopen(file2,"r");
	while (fgets(reco,41,fp2)>0)
	{
		printf("\t%40s",reco);
	}

	getch();
}
