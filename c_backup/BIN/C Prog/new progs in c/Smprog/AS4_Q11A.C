
	/***************************************************
	* Assignment 4 .... Question 11 		   *
	* To return number of Consonants in a given string *
	* Application of Array	       		     	   *
	***************************************************/

#include<stdio.h>

void main()
{
	char str[20];
	int i,nc;
	int consonant();

		/* Input module starts */

	clrscr();
	gotoxy(10,10);
	printf("Enter the string : ");
	gets(str);

	gotoxy(10,15);
	printf("The original string is .... %s",str);

	nc=consonant(str);

	gotoxy(10,20);
	printf("The number of consonants in the string are .... %d",nc);

	getch();
}

int consonant(char str[])
{
	int i=0,con=0;
	char c;
	while(str[i]!='\0')
	{
		c=str[i];
		if((c>=65 && c<=90)||(c>=97 && c<=122)&&
		    c!='A'&&c!='E'&&c!='I'&&c!='O'&&c!='U'
		  &&c!='a'&&c!='e'&&c!='i'&&c!='o'&&c!='u')
			con++;
		i++;
	}
	return con;
}
