
	/************************************
	* Assignment 4 .... Question 15	    *
	* To print the Concordance Analysis *
	* Application of Array	       	    *
	************************************/

#include <stdio.h>
#include <string.h>

	/* Concordance analysis problem */

	void concord(char [],int *,int *,int *,int *,int *,int *);

void main()
{
	char str[50];
	int nl=0,nv=0,nc=0,nb=0,nd=0,ns=0;
	clrscr();

	gotoxy(10,10);
	printf("Please enter any string : ");
	gets(str);

	concord(str,&nl,&nv,&nc,&nb,&nd,&ns);

	printf("\n\tThe number of letters in the string are : %d\n",nl);
	printf("\n\tThe number of vowels in the string are : %d\n",nv);
	printf("\n\tThe number of consonants in the string are : %d\n",nc);
	printf("\n\tThe number of blanks in the string are : %d\n",nb);
	printf("\n\tThe number of digits in the string are : %d\n",nd);
	printf("\n\tThe number of special characters are : %d\n",ns);

	printf("\n\n\tPress any key to continue....");
	while (! kbhit());
}

void concord(char str[],int *nl,int *nv,int *nc,int *nb,int *nd,int *ns)
{
	int i,l;
	l=strlen(str);
	gotoxy(10,15);
	printf("The length of the string is : %d\n\n",l);

	/* count the number of letters */

	for (i=0;i<l;i++)
	{
		if ( (str[i]>=65 && str[i]<=90) || (str[i]>=97 && str[i]<=122) )
			(*nl)++;
	}

	/* count the number of vowels */

	for (i=0;i<l;i++)
	{
		if (str[i]=='A'|| str[i]=='a' || str[i]=='E' || str[i]=='e' || str[i]=='I' || str[i]=='i' || str[i]=='O' || str[i]=='o' || str[i]=='U' ||str[i]=='u')
			(*nv)++;
	}

	/* count the number of consonants */

	*nc=*nl-*nv;

	/* count the number of blanks */

	for (i=0;i<l;i++)
	{
		if (str[i]==32)
			(*nb)++;
	}

	/* count the number of digits */

	for (i=0;i<l;i++)
	{
		if (str[i]>=48 && str[i]<=57)
			(*nd)++;
	}

	/* count the number of special characters */

	*ns=l-(*nl+*nb+*nd);
}
