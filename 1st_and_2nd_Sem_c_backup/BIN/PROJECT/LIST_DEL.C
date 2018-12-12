/*******************************************************
 Statement - Accept a list of data items and find the second largest and second smallest elements in it.
 Programmer - Vineet Choudhary
 Written For - https://turboc.codeplex.com
 *******************************************************/

/* Accept a list of data items and find the second
 largest and second smallest elements in it. And also computer the average
 of both. And search for the average value whether it is present in the
 array or not. Display appropriate message on successful search.    */

#include <stdio.h>
#include <conio.h>

void main ()
{
    int number[30];
    int i,j,a,n,counter,ave;
    clrscr();
    
    printf ("Enter the value of N\n");
    scanf ("%d", &n);
    
    printf ("Enter the numbers \n");
    for (i=0; i<n; ++i)
        scanf ("%d",&number[i]);
    
    for (i=0; i<n; ++i)
    {
        for (j=i+1; j<n; ++j)
        {
            if (number[i] < number[j])
            {
                a        = number[i];
                number[i] = number[j];
                number[j] = a;
            }
        }
    }
    
    printf ("The numbers arranged in descending order are given below\n");
    for (i=0; i<n; ++i)
    {
        printf ("%d\n",number[i]);
    }
    
    printf ("The 2nd largest number is  = %d\n", number[1]);
    printf ("The 2nd smallest number is = %d\n", number[n-2]);
    
    ave = (number[1] +number[n-2])/2;
    counter = 0;
    
    for (i=0; i<n; ++i)
    {
        if (ave == number[i])
        {
            ++counter;
        }
    }
    if (counter == 0 )
        printf ("The average of %d  and %d is = %d is not in the array\n", number[1], number[n-2], ave);
    else
        printf ("The average of %d  and %d in array is %d in numbers\n",number[1], number[n-2], counter);
    
    getch();
}           /* End of main() */

/*-------------------------------------------------------
 Output
 Enter the value of N
 6
 Enter the numbers
 30
 80
 10
 40
 70
 90
 The numbers arranged in descending order are given below
 90
 80
 70
 40
 30
 10
 The 2nd largest number is  = 80
 The 2nd smallest number is = 30
 The average of 80  and 30 is = 55 is not in the array
 
 
 -------------------------------------------------------*/