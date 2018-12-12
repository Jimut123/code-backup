
	/*************************************************************
	* Assignment 5 .... Question 2             		     *
	* Program to copy the contents of one file into another file *
	* Using Command Line Arguments				     *
	*************************************************************/

#include<stdio.h>

int main(int argc, char *argv[])
{
	FILE *fp1,*fp2;
	char c;
//	clrscr();

	/* Checking number of arguments */

	if (argc!=3)
	{
//		gotoxy(10,10);
		printf("Invalid number of arguments....");
//		getch();
//		exit();
	}

	fp1=fopen(argv[1],"r");
	fp2=fopen(argv[2],"w");

	/* Checking whether the source file exists or not */

	if(fp1==NULL)
	{
//		gotoxy(10,10);
		printf("File cannot be opened....");
//		getch();
//		exit();
	}

	/* Copying the contents of file1 to file2 */

	while((c=getc(fp1))!=EOF)
		putc(c,fp2);

	fclose(fp1);
	fclose(fp2);

	fp2=fopen(argv[2],"r");

	/* Checking whether the target file is created or not */

	if(fp2==NULL)
	{
//		gotoxy(10,10);
		printf("File cannot be created....");
//		getch();
//		exit();
	}

	/* Displaying the contents of the target file */

//	clrscr();
//	gotoxy(10,10);
	printf("The contents of the target file are as follows....\n\n");
//	getch();
	while((c=getc(fp2))!=EOF)
		putchar(c);
	fclose(fp2);

//	getch();
}
