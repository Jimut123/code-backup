
	/*******************************************
	* Assignment 5 .... Question 1             *
	* Program to create a text file            *
	* and to print the above file in a console *
	* Using Command Line Arguments             *
	*******************************************/

#include<stdio.h>

void main(int argc, char *argv[])
{
	FILE *fp;
	char c;
	clrscr();

	/* Checking number of arguments */

	if (argc!=2)
	{
		gotoxy(10,10);
		printf("Invalid number of arguments....");
		getch();
		exit();
	}

	/* Checking whether the file is created or not */

	fp=fopen(argv[1],"w");
	if(fp==NULL)
	{
		gotoxy(10,15);
		printf("File cannot be created....");
		getch();
		exit();
	}

	/* Scanning the contents of the file */

	clrscr();
	printf("\n\nEnter the contents of the file....\n\n");
	while((c=getchar())!=EOF)
		putc(c,fp);
	fclose(fp);

	/* Displaying the contents of the file */

	clrscr();
	gotoxy(10,10);
	printf("The contents of the file are as follows....\n\n");
	fp=fopen(argv[1],"r");
	while ((c=getc(fp))!=EOF)
		putchar(c);
	getch();
}
