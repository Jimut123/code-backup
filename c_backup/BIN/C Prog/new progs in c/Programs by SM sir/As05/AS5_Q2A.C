
	/*************************************************************
	* Assignment 5 .... Question 2             		     *
	* Program to copy the contents of one file into another file *
	*************************************************************/

#include<stdio.h>

void main()
{
	FILE *fp1,*fp2;
	char c,file1[20],file2[20];
	clrscr();

	/* Scanning the source and target file names */

	gotoxy(10,10);
	printf("Enter the source file name : ");
	scanf(" %[^\n]",file1);

	gotoxy(10,15);
	printf("Enter the target file name : ");
	scanf(" %[^\n]",file2);

	clrscr();
	fp1=fopen(file1,"r");
	fp2=fopen(file2,"w");

	/* Checking whether the source file exists or not */

	if(fp1==NULL)
	{
		gotoxy(10,10);
		printf("File cannot be opened....");
		getch();
		exit();
	}

	/* Copying the contents of file1 to file2 */

	while((c=getc(fp1))!=EOF)
		putc(c,fp2);

	fclose(fp1);
	fclose(fp2);

	fp2=fopen(file2,"r");

	/* Checking whether the target file is created or not */

	if(fp2==NULL)
	{
		gotoxy(10,10);
		printf("File cannot be created....");
		getch();
		exit();
	}

	/* Displaying the contents of the target file */

	clrscr();
	gotoxy(10,10);
	printf("The contents of the target file are as follows....\n\n");
	getch();
	while((c=getc(fp2))!=EOF)
		putchar(c);
	fclose(fp2);

	getch();
}
