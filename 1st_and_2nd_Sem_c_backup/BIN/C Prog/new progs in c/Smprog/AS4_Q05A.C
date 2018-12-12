
	/*******************************************
	* Assignment 4 .... Question 5        	   *
	* To convert Uppercase to Lowercase string *
	* Application of Array		     	   *
	*******************************************/

#include<stdio.h>

void main()
{
	char str[20];
	int i;
	void tolowercase();

		/* Input module starts */

	clrscr();
	gotoxy(10,10);
	printf("Enter the string : ");
	gets(str);

	gotoxy(10,15);
	printf("The original string is .... %s",str);

	tolowercase(str);

	gotoxy(10,20);
	printf("The lowercase string is .... %s",str);

	getch();
}

void tolowercase(char str[])
{
	int i;
	for(i=0;str[i]!='\0';i++)
		if(str[i]>=65 && str[i]<=90)
			str[i]=str[i]+32;
}
