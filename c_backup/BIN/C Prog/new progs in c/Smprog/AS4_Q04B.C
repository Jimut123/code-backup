
	/****************************************
	* Assignment 4 .... Question 4          *
	* To reverse a given string onto itself *
	* Application of Pointers 	        *
	****************************************/

#include<stdio.h>

void main()
{
	char *str;
	int i;
	void strreverse();

		/* Input module starts */

	clrscr();
	gotoxy(10,10);
	printf("Enter the string : ");
	gets(str);

	gotoxy(10,15);
	printf("The original string is .... %s",str);

	strreverse(str);

	gotoxy(10,20);
	printf("The reverse string is .... %s",str);

	getch();
}

void strreverse(char *str)
{
	int i,j;
	char tmp;
	for(i=0;*(str+i)!='\0';i++)
		;
	i--;
	for(j=0;j<=i;j++,i--)
	{
		tmp=*(str+j);
		*(str+j)=*(str+i);
		*(str+i)=tmp;
	}
}
