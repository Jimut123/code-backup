/*******************************************************
 
Statement - Minimum element location
 in array 
Programmer - Vineet Choudhary
 
Written For - https://turboc.codeplex.com
 
*******************************************************/
#include <stdio.h>
#include <conio.h>

void main() 
{
    int array[100], minimum, size, c, location = 1;
    clrscr();
 
    printf("Enter the number of elements in array\n");
    scanf("%d",&size);
 
    printf("Enter %d integers\n", size);
 
    for ( c = 0 ; c < size ; c++ )
        scanf("%d", &array[c]);
 
    minimum = array[0];
 
    for ( c = 1 ; c < size ; c++ ) 
    {
        if ( array[c] < minimum ) 
        {
           minimum = array[c];
           location = c+1;
        }
    } 
 
    printf("Minimum element is present at location %d and it's value is %d.\n", location, minimum);
    getch();
}