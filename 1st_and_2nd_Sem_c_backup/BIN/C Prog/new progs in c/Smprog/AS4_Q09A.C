
	/*******************************
	* Assignment 4 .... Question 9 *
	* To All Trim a given string   *
	* Application of Array	       *
	*******************************/

#include<stdio.h>

void main()
{
	char str[20];
	int i;
	void alltrim();

		/* Input module starts */

	clrscr();
	gotoxy(10,10);
	printf("Enter the string : ");
	gets(str);

	gotoxy(10,15);
	printf("The original string is .... =>%s<=",str);

	alltrim(str);

	gotoxy(10,20);
	printf("The modified string after alltrim is .... =>%s<=",str);

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

void alltrim(char str[])
{
	int i,j;
	void ltrim();
	void rtrim();
	ltrim(str);
	rtrim(str);
	for (i=0,j=0;str[i]!='\0';i++)
	{
		if(str[i]==' ')
		{
			str[j++]=str[i];
			while(str[i]==' ')
				i++;
			i--;
		}
		else
		{
			str[j++]=str[i];
		}
	}
	str[j]='\0';
}
