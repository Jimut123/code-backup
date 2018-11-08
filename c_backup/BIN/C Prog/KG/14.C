/* Write a program to ask the user to enter a character. If the user enter a or A
print The Character is a or A, if the user enter b or B print
The Character is b or B, if the user enter c or C print The Character is c or C,
otherwise print Other than a, b, c, A, B, C.*/

#include <stdio.h>
main()
{
	char ch;
	clrscr();
	printf("\nEnter A Character: ");
	scanf("%c",&ch);
	switch(ch)
	{
		case 'a':
		case 'A':
			printf("\nCharacter Is a Or A");
			break;
		case 'b':
		case 'B':
			printf("\nCharacter Is b Or B");
			break;
		case 'c':
		case 'C':
			printf("\nCharacter Is c or C");
			break;
		default:
			printf("\nCharacter Is Other Than a,b,c,A,B,C");
	}
	getch();
}