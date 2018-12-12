
	/***************************************************
	* Assignment 4 .... Question 14			   *
	* To print the combination of characters in a word *
	* Application of Array	       		     	   *
	***************************************************/

#include<stdio.h>

void main()
{
	int i,j,k,l;
	char word[3];
	clrscr();

		/* Input module starts */

	do
	{
		gotoxy(10,10);
		printf("Please enter any 3 alphabet word : ");
		scanf("%s",word);
		l=strlen(word);
		if (l!=3)
		{
			gotoxy(10,20);
			printf("Invalid input....Not a 3 letter word....Please try again");
			getch();
			clrscr();
		}
	}
	while (l!=3);

	gotoxy(10,15);
	printf("The combinations of the word are as follows....\n\n");

		/* Calculation starts */

	for(i=0;i<3;i++)
	   for(j=0;j<3;j++)
	      for(k=0;k<3;k++)
		 if(i!=j && j!=k && k!=i)
			printf("\t %c%c%c",word[i],word[j],word[k]);
	getch();
}
