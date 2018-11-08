#include<stdio.h>
main()
{
 char ch;
 printf("\n Enter any character from the keyboard: ");
 scanf("%c",&ch);
 printf("%d",ch);
 if ( ch >=65 && ch <=90)
	printf("\n Characterv entered is an UPPERCASE letter");
 if (ch >= 97 && ch <=122)
	printf("\n the character entered is a lowercase letter");
 if (ch >=48 && ch <=57)
	printf("\n The character entered is a digit");
 if ((ch >=0 && ch <=48) || (ch > 57 && ch < 65) || (ch > 90 && ch <97) || ch >122)
	printf("\n The charcter entered is a special symbol");
 printf("\n \n \n Press any key to Exit...");
}
