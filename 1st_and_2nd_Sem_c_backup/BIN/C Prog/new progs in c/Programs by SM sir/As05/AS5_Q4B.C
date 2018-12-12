
	/************************************************************
	* Assignment 5 .... Question 4             		    *
	* Program to find the frequency of all words in a text file *
	* Using Command Line Arguments
	************************************************************/

#include<stdio.h>

void main(int argc, char *argv[])
{
	char a[500][80],temp[80],c;
	int i=0,j=0,n,ct=1,lc=0;
	FILE *fp;
	clrscr();

	/* Checking number of arguments */

	if (argc!=2)
	{
		gotoxy(10,10);
		printf("Invalid number of arguments....");
		getch();
		exit();
	}

	/* Scanning the words from the file */

	fp=fopen(argv[1],"r");
	while((c=getc(fp))!=EOF)
	{
		if ( c!='\n' && c!='\'' && c!='.' && c!=':' && c!=' '
		  && c!='\t' && c!='\"' && c!=',' && c!=';' && c!='-' )
		{
			a[i][j]=c;
			j++;
		}
		else
		{
			a[i][j]='\0';
			i++;
			j=0;
		}
	}
	n=i;
	gotoxy(10,15);
	printf("The number of words in the file are : %d",n);
	getch();
	clrscr();

	/* Sorting the words in the file */

	for(i=0;i<=n-2;i++)
	{
		for(j=0;j<n-i-1;j++)
		{
			if(strcmp(a[j],a[j+1])>0)
			{
				strcpy(temp,a[j]);
				strcpy(a[j],a[j+1]);
				strcpy(a[j+1],temp);
			}
		}
	}

	/* Printing the words and their frequency */

	for(i=0;i<n;i++)
	{
		if(strcmp(a[i],a[i+1])==0)
			ct++;
		else
		{
		    printf("\n\'%-s\'\n\t\t\t\toccurs %4d times.", a[i],ct);
			lc+=2;
			if (lc%20==0)
			{
				gotoxy(10,25);
				printf("Press any key to continue....");
				getch();
				clrscr();
			}
			ct=1;
		}
	}
	fclose(fp);
	getch();
}
