
	/*************************************
	* Assignment 4 .... Question 2       *
	* To copy a string to another string *
	* Application of Array 		     *
	*************************************/

#include<stdio.h>

void main()
{
	char str1[20],str2[20];
	int i;
	void strcp();

		/* Input module starts */

	clrscr();
	gotoxy(10,10);
	printf("Enter the string : ");
	gets(str1);

	gotoxy(10,15);
	printf("The original string is .... %s",str1);

	strcp(str1,str2);

	gotoxy(10,20);
	printf("The modified string is .... %s",str2);

	getch();
}

void strcp(char str1[],char str2[])
{
	int i;
	for(i=0;str1[i]!='\0';i++)
		str2[i]=str1[i];
	str2[i]='\0';
}

