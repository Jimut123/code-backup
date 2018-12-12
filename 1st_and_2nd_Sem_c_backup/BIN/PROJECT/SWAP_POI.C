/**********************************************************
 Statement - accept an array of 10 elements and swap 3rd element with 4th element using pointers.
 Programmer - Vineet Choudhary
 Written For - https://turboc.codeplex.com
 **********************************************************/

#include <stdio.h>
#include <conio.h>

void main()
{
    
    float x[10];
    int i,n;
    clrscr();
    
    void swap34(float *ptr1, float  *ptr2 ); /* Function Declaration */
    
    printf("How many Elements...\n");
    
    scanf("%d", &n);
    
    printf("Enter Elements one by one\n");
    
    for(i=0;i<n;i++)
    {
        scanf("%f",x+i);
    }
    
    swap34(x+2, x+3);      /* Function call:Interchanging 3rd element by 4th */
    
    printf("\nResultant Array...\n");
    for(i=0;i<n;i++)
    {
        printf("X[%d] = %f\n",i,x[i]);
    }
    
    getch();
}     /* End of main() */

/* Function to swap the 3rd element with the 4th element in the array */

void swap34(float *ptr1, float *ptr2 )      /* Function Definition */
{
    float temp;
    
    temp   = *ptr1;
    *ptr1  = *ptr2;
    *ptr2  = temp;
}                                            /* End of Function */

/*-------------------------------------------
 Output
 How many Elements...
 10
 Enter Elements one by one
 10
 20
 30
 40
 50
 60
 70
 80
 90
 100
 
 Resultant Array...
 X[0] = 10.000000
 X[1] = 20.000000
 X[2] = 40.000000
 X[3] = 30.000000
 X[4] = 50.000000
 X[5] = 60.000000
 X[6] = 70.000000
 X[7] = 80.000000
 X[8] = 90.000000
 X[9] = 100.000000
 ----------------------------------------------------*/
