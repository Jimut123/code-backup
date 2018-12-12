
	/*******************************************
	* Assignment 5 .... Question 1             *
	* Program to create a text file            *
	* and to print the above file in a console *
	*******************************************/

#include<stdio.h>

void main()
{
	FILE *fp;
	char c,filename[20];
	clrscr();

	/* Scanning the file name from the user */

	gotoxy(10,10);
	printf("Enter the filename you want to create : ");
	scanf(" %[^\n]",filename);

	/* Checking whether the file is created or not */

	fp=fopen(filename,"w");
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
	fp=fopen(filename,"r");
	while ((c=getc(fp))!=EOF)
		putchar(c);
	getch();
}
