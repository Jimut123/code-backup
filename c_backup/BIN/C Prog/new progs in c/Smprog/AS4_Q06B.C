
	/*******************************************
	* Assignment 4 .... Question 6        	   *
	* To convert Lowercase to Uppercase string *
	* Application of Pointers	     	   *
	*******************************************/

#include<stdio.h>

void main()
{
	char *str;
	int i;
	void touppercase();

		/* Input module starts */

	clrscr();
	gotoxy(10,10);
	printf("Enter the string : ");
	gets(str);

	gotoxy(10,15);
	printf("The original string is .... %s",str);

	touppercase(str);

	gotoxy(10,20);
	printf("The uppercase string is .... %s",str);

	getch();
}

void touppercase(char *str)
{
	int i;
	for(i=0;*(str+i)!='\0';i++)
		if(*(str+i)>=97 && *(str+i)<=122)
			*(str+i)=*(str+i)-32;
}
