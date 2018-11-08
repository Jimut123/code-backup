/*******************************************************
 Statement - Copy element of one array into another
 Programmer - Vineet Choudhary
 Written For - https://turboc.codeplex.com
 *******************************************************/

#include <stdio.h>
#include <string.h>
#include <conio.h>

void main()
{
    int arr1[30], arr2[30], i, num;
    clrscr();
    
    printf("\nEnter no of elements :");
    scanf("%d", &num);
    
    //Accepting values into Array
    printf("\nEnter the values :");
    for (i = 0; i < num; i++)
    {
        scanf("%d", &arr1[i]);
    }
    
    //Copying data from array 'a' to array 'b'
    for (i = 0; i < num; i++)
    {
        arr2[i] = arr1[i];
    }
    
    //Printing of all elements of array
    printf("The copied array is :");
    for (i = 0; i < num; i++)
    {
        printf("\narr2[%d] = %d", i, arr2[i]);
    }
    
    getch();
}