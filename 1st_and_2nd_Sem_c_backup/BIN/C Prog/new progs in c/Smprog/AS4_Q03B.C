
	/**********************************************
	* Assignment 4 .... Question 3        	      *
	* To concatenate two strings into a third one *
	* Application of Pointers	     	      *
	**********************************************/

#include<stdio.h>

void main()
{
	char *str1,*str2,*str3;
	int i;
	void strconcat();

		/* Input module starts */

	clrscr();
	gotoxy(10,10);
	printf("Enter the first string : ");
	gets(str1);

	gotoxy(10,12);
	printf("Enter the second string : ");
	gets(str2);

	gotoxy(10,14);
	printf("The first string is .... %s",str1);

	gotoxy(10,16);
	printf("The second string is .... %s",str2);

	strconcat(str1,str2,str3);

	gotoxy(10,20);
	printf("The concatenated string is .... %s",str3);

	getch();
}

void strconcat(char *str1,char *str2,char *str3)
{
	int i,j;
	for(i=0;*(str1+i)!='\0';i++)
		*(str3+i)=*(str1+i);
	for(j=0;*(str2+j)!='\0';i++,j++)
		*(str3+i)=*(str2+j);
	*(str3+i)='\0';
}
