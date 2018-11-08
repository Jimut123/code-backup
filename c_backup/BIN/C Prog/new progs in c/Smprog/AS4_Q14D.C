
	/***************************************************
	* Assignment 4 .... Question 14			   *
	* To print the combination of characters in a word *
	* Application of Pointers (Recursion)	     	   *
	***************************************************/

#include<stdio.h>

void permutation();

void main()
{
	int i,l;
	char *str;

	clrscr();
	gotoxy(10,10);
	printf("Enter any word : ");
	scanf("%s",str);
	l=strlen(str);

	gotoxy(10,15);
	printf("The permutation of the word %s is as follows....\n\n");

	permutation(str,0,l-1);

	getch();
}

	/* Recursion function starts here */

void permutation(char *str,int l,int h) /* l=low , h=high */
{
	char *str1;
	int i,j;
	char t;
	strcpy(str1,str);
	if (l==h)
	{
		printf("\t");
		for (i=0;i<=h;i++)
			printf("%c",*(str1+i));
	}
	else
	{
		for (i=l;i<=h;i++)
		{
			t=*(str1+l);
			*(str1+l)=*(str1+i);
			*(str1+i)=t;
			permutation(str1,l+1,h);
		}
	}
}
