/**********************************************************
 Statement - Delete duplicate elements in an array
 Programmer - Vineet Choudhary
 Written For - https://turboc.codeplex.com
 **********************************************************/

#include<stdio.h>
#include<conio.h>

void main()
{
    int arr[20], i, j, k, size;
    clrscr();
    
    printf("\nEnter array size : ");
    scanf("%d", &size);
    
    printf("Enter Numbers : \n");
    for (i = 0; i < size; i++)
    {
        scanf("%d", &arr[i]);
    }
    
    printf("\nArray with Unique list  : ");
    for (i = 0; i < size; i++)
    {
        for (j = i + 1; j < size;)
        {
            if (arr[j] == arr[i])
            {
                for (k = j; k < size; k++)
                {
                    arr[k] = arr[k + 1];
                }
                size--;
            }
            else
            {
                j++;
            }
        }
    }
    
    for (i = 0; i < size; i++) {
        printf("%d ", arr[i]);
    }
    
    getch();
}