
	/******************************************************
	* Assignment 4 .... Question 17	    		      *
	* To print the frequency of words in a given sentence *
	* Application of Array	       	    		      *
	******************************************************/

#include <stdio.h>

void main()
{
	char a[400],b[20],c[20];
	int i,j=0,count=0;
	clrscr();

	printf("\nEnter any string you want : ");
	gets(a);
	printf("\nEnter the word you want to search : ");
	gets(b);

	printf("\nThe string is : \"%s\" .",a);
	printf("\nThe word is : \"%s\" .",b);
	printf("\n");

	for (i=0;;i++,j++)
	{
		c[j]=a[i];
		if ( a[i]==' ' || a[i]=='\0' )
		{
			c[j]='\0';
			printf("\nString b[] & String c[] are : %s , %s ",b,c);

			if ( stricmp(b,c) == 0 )
			{
				count=count+1;
			}
		j=-1;
		}
		if ( a[i]=='\0' )
			break;
	}

	printf("\n\nThe frequency of the word \"%s\" is : %d ",b,count);

getch();
}
