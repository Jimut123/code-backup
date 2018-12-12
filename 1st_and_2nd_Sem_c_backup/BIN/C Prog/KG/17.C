/* Write a program to ask the user for a number. Print the square of the
number and ask a confirmation from the user whether the user wants to
continue or not. */

#include <stdio.h>
main()
{
	char ch='Y';
	int num;
	while (ch=='y'|| ch=='Y')
	{
		printf("\nENTER A NUMBER: ");
		scanf("%d",&num);
		printf("\nITS SQUARE IS: %d\n",num*num);
		
		printf("\n Press Y/y to continue: ");
		scanf("%c", &ch);
	}
}
