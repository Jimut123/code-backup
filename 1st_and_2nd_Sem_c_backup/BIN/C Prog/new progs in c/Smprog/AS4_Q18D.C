
	/*********************************************************
	* Assignment 4 .... Question 18	    		      	 *
	* To check whether a given string is a palindrome or not *
	* Application of Pointers (Recursion)  		      	 *
	*********************************************************/

#include <stdio.h>
#include<string.h>

void main()
{
	char *str;
	int flag,i=0,j=0,l;
	int palin(char *str,int i,int j);
	clrscr();

	gotoxy(10,10);
	printf("Please enter any string : ");
	gets(str);
	l=strlen(str);
	j=l-1;
	flag=palin(str,i,j);

	gotoxy(10,15);
	if(flag==0)
		printf("It is not a palindrome");
	else
		printf("It is a palindrome");
	getch();
}

int palin(char *str,int i,int j)
{
	if(*(str+i)!=*(str+j))
	{
	return 0;
	}
	else
	{
	    palin(str,i+1,j-1);
	    return 1 ;
	}
}
