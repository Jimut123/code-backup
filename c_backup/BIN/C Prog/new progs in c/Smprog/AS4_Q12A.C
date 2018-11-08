
	/*************************************************
	* Assignment 4 .... Question 12 		 *
	* To match a pattern p[] from a given string s[] *
	* Application of Array	       		     	 *
	*************************************************/

#include<stdio.h>

void main()
{
	char s[50],p[50];
	int compare(char [], char [],int);
	int t,n;
	clrscr();

	gotoxy(10,5);
	printf("Enter the main string : ");
	gets(s);
	gotoxy(10,10);
	printf("Enter the substring/pattern : ");
	gets(p);
	gotoxy(10,15);
	printf("Enter the position from where you want to start : ");
	scanf("%d",&n);
	t = compare(s,p,n);
	if (t == 0)
	{
		gotoxy(10,20);
		printf("The pattern does not exist in the main string from position %d",n);
	}
	else
	{
		gotoxy(10,20);
		printf("The pattern matches %d times in the main string from position %d",t,n);
	}
	getch();
}

int compare(char s[],char p[],int n)
{
	int i=0,j=0,l1=0,l2=0,count=0;
	l1=strlen(s);
	l2=strlen(p);
	i=n-1;
	while(i<l1)
	{
		while(j<l2)
		{
			if(s[i] == p[j])
			{
				i++;
				j++;
			}
			else
			{
				j=0;
				break;
			}
		}
		i++;
		if(j==l2)
		{
			count++;
			j=0;
		}
	}
	return count;
}
