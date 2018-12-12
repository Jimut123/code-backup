
	/****************************************************
	* Assignment 4 .... Question 13			    *
	* To return number of words from a given string s[] *
	* Application of Pointers      		     	    *
	****************************************************/

#include<stdio.h>

void main()
{
	char *str;
	int w;
	clrscr();

		/* Input module starts */

	clrscr();
	gotoxy(10,10);
	printf("Please enter any string : ");
	gets(str);
	w=words(str);
	printf("\n\n\tThe total number of words are : %d",w);
	printf("\n\n\tPress any key to continue....");
	while (! kbhit());
}

		/* Extraction of the words in a given string */

int words(char *str)
{
	char *word;
	int i,l,j=0,wc=0;
	l=strlen(str);
	gotoxy(10,12);
	printf("The length of string is : %d\n",l);

	for (i=0;i<(l+1);i++)		/* (+1) for '\0' */
	{
		if ( *(str+i)=='-' || (*(str+i)>=65 && *(str+i)<=90) || (*(str+i)>=97 && *(str+i)<=122) )
		{
			*(word+j)=*(str+i);
			j++;
		}
		if ( *(str+i)==' ' || *(str+i)==',' || *(str+i)==';' || *(str+i)=='.' || *(str+i)=='?' || *(str+i)==':' || *(str+i)=='\0' )
		{
			++wc;
			*(word+j)='\0';
			printf("\n\tword [%d] is : %s",wc,word);
			j=0;
		}
	}
	return wc;
}
