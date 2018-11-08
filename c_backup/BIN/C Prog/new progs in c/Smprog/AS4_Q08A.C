
	/*******************************
	* Assignment 4 .... Question 8 *
	* To Right Trim a given string *
	* Application of Array	       *
	*******************************/

#include<stdio.h>

void main()
{
	char str[20];
	int i;
	void rtrim();

		/* Input module starts */

	clrscr();
	gotoxy(10,10);
	printf("Enter the string : ");
	gets(str);

	gotoxy(10,15);
	printf("The original string is .... =>%s<=",str);

	rtrim(str);

	gotoxy(10,20);
	printf("The modified string after rtrim is .... =>%s<=",str);

	getch();
}

void rtrim(char str[])
{
	int i,j;
	for(i=0;str[i]!='\0';i++)
		;
	i--;
	for ( ;str[i]==' ';i--)
		;
	str[i+1]='\0';
}
