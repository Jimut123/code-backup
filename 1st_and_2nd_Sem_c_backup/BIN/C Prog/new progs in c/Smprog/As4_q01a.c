
	/*********************************
	* Assignment 4 .... Question 1   *
	* To find the length of a string *
	* Application of Array 		 *
	*********************************/

#include<stdio.h>

void main()
{
	char str[20];
	int n,strln();

		/* Input module starts */

	clrscr();
	gotoxy(10,10);
	printf("Enter the string : ");
	gets(str);

	n=strln(str);
	gotoxy(10,20);
	printf("The length of the string is .... %d",n);

	getch();
}

int strln(char str[])
{
	int i;
	for(i=0;str[i]!='\0';i++)
		;
	return i;
}
