
	/*********************************************************
	* Assignment 4 .... Question 18	    		      	 *
	* To check whether a given string is a palindrome or not *
	* Application of Array      	    		      	 *
	*********************************************************/

#include <stdio.h>
#include<string.h>

void main()
{
	char str[50],str1[50];
	void palindrome(char [], char []);
	clrscr();

	gotoxy(10,10);
	printf("Enter the string : ");
	gets(str);
	palindrome(str,str1);
	gotoxy(10,15);
	printf("The string is .... ");
	if(strcmpi(str,str1)==0)
		 printf("Palindrome");
	else
		 printf("Not Palindrome");
	getch();
}

void palindrome(char str[], char str1[])
{
	 int i,t=0;
	 for(i=strlen(str)-1; i>=0; i--)
	 {
			str1[t] = str[i];
			t++;
	 }
	 str1[t] = '\0';
}
