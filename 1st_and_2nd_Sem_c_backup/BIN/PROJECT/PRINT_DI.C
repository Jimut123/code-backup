/*******************************************************
 Statement - Print Diamond
 Programmer - Vineet Choudhary
 Written For - https://turboc.codeplex.com
 *******************************************************/

#include <stdio.h>
#include <conio.h>

void main()
{
    int n, c, k, space = 1;
    clrscr();
    
    printf("Enter number of rows\n");
    scanf("%d", &n);
    
    space = n - 1;
    
    for (k = 1; k <= n; k++)
    {
        for (c = 1; c <= space; c++)
            printf(" ");
        
        space--;
        
        for (c = 1; c <= 2*k-1; c++)
            printf("*");
        
        printf("\n");
    }
    
    space = 1;
    
    for (k = 1; k <= n - 1; k++)
    {
        for (c = 1; c <= space; c++)
            printf(" ");
        
        space++;
        
        for (c = 1 ; c <= 2*(n-k)-1; c++)
            printf("*");
        
        printf("\n");
    }
    
    getch();
}