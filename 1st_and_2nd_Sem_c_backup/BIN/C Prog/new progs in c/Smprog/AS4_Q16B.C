
	/******************************************************
	* Assignment 4 .... Question 16	    		      *
	* To find the length of the greatest common substring *
	* Application of Pointers      	   		      *
	******************************************************/

#include <stdio.h>
#include <string.h>

int stringcomp();
int getline();

void main()
{
	char *st1,*st2;
	int l1,l2,len;
	clrscr();

	gotoxy(10,10);
	printf("Enter your first string : ");
	l1=getline(st1);
	gotoxy(10,15);
	printf("Enter your second string : ");
	l2=getline(st2);

	if(l1>l2)
		len=stringcomp(l2,st2,l1,st1);
	else
		len=stringcomp(l1,st1,l2,st2);

	clrscr();
	gotoxy(10,10);
	printf("First string=%s\n",st1);
	gotoxy(10,15);
	printf("Second string=%s\n",st2);
	gotoxy(10,20);
	printf("Length of greatest common substring=%d\n",len);
	gotoxy(10,25);
	printf("Press any key to finish the program....");
	getch();
}

	/* Function getline() to input a sentence */

int getline(char *s)
{
	int n=0;
	char c;
	do
	{
		c=getch();
		putchar(c);
		if(c!=13)
		{
			*(s+n)=c;
			n++;
		}
	}
	while(c!=13);
	*(s+n)='\0';
	return n;
}

	/* Function stringcomp() to compare two strings */

int stringcomp(int l1, char *s1, int l2, char *s2)
{
	int i,j,k,n,max=0;
	char c1,c2;

		/* comparison of two strings */

	for(i=0;i<l1;i++)
	{
		c1=*(s1+i);
		k=i;
		n=0;
		for(j=0;j<l2;j++)
		{
			c2=*(s2+j);
			if(c1==c2)
			{
				n++;
				k++;
				c1=*(s1+k);
			}
			else
			{
				if(n>max)
					max=n;
				n=0;
				k=i;
			}
		}
	}
	return max;
}
