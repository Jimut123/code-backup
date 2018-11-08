				/*Switch Case*/

/* Write a program to ask the user to enter a number.
	If the number is 1 print ONE,
	if the number is 2 print TWO,
	if the number is 3 print THREE,
	otherwise print "Other than One, Two or Three"*/

#include <stdio.h>
main()
{
	int i;
	clrscr();
	printf("\nENTER A NUMBER: ");
	scanf("%d",&i);
	switch(i)
	{
		case 1:
			printf("\nNUMBER IS ONE");
			break;
		case 2:
			printf("\nNUMBER IS TWO");
			break;
		case 3:
			printf("\nNUMBER IS THREE");
			break;
		default:
			printf("\nNUMBER IS OTHER THAN ONE, TWO OR THREE");
	}
	getch();
}