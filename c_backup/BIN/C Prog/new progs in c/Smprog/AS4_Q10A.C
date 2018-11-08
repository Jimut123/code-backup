
	/***********************************************
	* Assignment 4 .... Question 10 	       *
	* To return number of Vowels in a given string *
	* Application of Array	       		       *
	***********************************************/

#include<stdio.h>

void main()
{
	char str[20];
	int i,nv;
	int vowel();

		/* Input module starts */

	clrscr();
	gotoxy(10,10);
	printf("Enter the string : ");
	gets(str);

	gotoxy(10,15);
	printf("The original string is .... %s",str);

	nv=vowel(str);

	gotoxy(10,20);
	printf("The number of vowels in the string are .... %d",nv);

	getch();
}

int vowel(char str[])
{
	int i=0,v=0;
	char c;
	while(str[i]!='\0')
	{
		c=str[i];
		if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'
		 ||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			v++;
		i++;
	}
	return v;
}
