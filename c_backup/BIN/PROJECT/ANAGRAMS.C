/*******************************************
Statement - Sum of array elements using pointers
Programmer - Vineet Choudhary
Written For - https://turboc.codeplex.com
********************************************/
#include<stdio.h>
#include<conio.h>
void main() {
	int numArray[10];
	int i, sum = 0;
	int *ptr;

	printf("\nEnter 10 elements : ");
	
	//Accept the 10 elements from the user in the array.
	for (i = 0; i < 10; i++)
	{
		scanf("%d", &numArray[i]);
	}
	
	//address of first element
	ptr = numArray;

	//fetch the value from the location pointer by pointer variable.
	for (i = 0; i < 10; i++) 
	{
		sum = sum + *ptr;
		ptr++;
	}
   
	printf("The sum of array elements : %d", sum);
   
	getch();
}