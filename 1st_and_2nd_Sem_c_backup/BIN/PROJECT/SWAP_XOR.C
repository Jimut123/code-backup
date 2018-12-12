/**********************************************************
 Statement - swap the contents of two numbers using bitwise XOR operation. Don't use either the temporary variable or arithmetic operators
 Programmer - Vineet Choudhary
 Written For - https://turboc.codeplex.com
 **********************************************************/

#include <stdio.h>
#include <conio.h>

void main()
{
    long i,k;
    clrscr();
    
    printf("Enter two integers\n");
    scanf("%ld %ld",&i,&k);
    
    
    printf("\nBefore swapping i= %ld and k = %ld",i,k);
    
    i = i^k;
    k = i^k;
    i = i^k;
    
    printf("\nAfter swapping i= %ld and k = %ld",i,k);
    getch();
}

/*------------------------------------------
 Output
 Enter two integers
 23 34
 
 Before swapping i= 23 and k = 34
 After swapping i= 34 and k = 23
 ------------------------------------------*/
