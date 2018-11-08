
	/*******************************
	* Assignment 4 .... Question 7 *
	* To Left Trim a given string  *
	* Application of Array	       *
	*******************************/

#include<stdio.h>

void main()
{
	char str[20];
	int i;
	void ltrim();

		/* Input module starts */

	clrscr();
	gotoxy(10,10);
	printf("Enter the string : ");
	gets(str);

	gotoxy(10,15);
	printf("The original string is .... =>%s<=",str);

	ltrim(str);

	gotoxy(10,20);
	printf("The modified string after ltrim is .... =>%s<=",str);

	getch();
}

void ltrim(char str[])
{
	int i,j;
	for(i=0;str[i]==' ';i++)
		;
	for(j=0;str[i]!='\0';i++,j++)
		str[j]=str[i];
	str[j]='\0';
}
