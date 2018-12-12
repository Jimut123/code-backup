/**********************************************************************************
 Statement - Convert the given binary number into decimal
 Programmer - Vineet Choudhary
 Written For - https://turboc.codeplex.com
 **********************************************************************************/
#include <stdio.h>
#include <conio.h>

void main()
{
    int   num, bnum, dec = 0, base = 1, rem ;
    clrscr();
    
    printf("Enter a binary number(1s and 0s)\n");
    scanf("%d", &num);           /*maximum five digits */
    
    bnum = num;
    
    while( num > 0)
    {
        rem = num % 10;
        dec = dec + rem * base;
        num = num / 10 ;
        base = base * 2;
    }
    
    printf("The Binary number is = %d\n", bnum);
    printf("Its decimal equivalent is =%d\n", dec);
    
    getch();
} 			/* End of main() */

/*---------------------------------------------
 Output
 Enter a binary number(1s and 0s)
 10101
 The Binary number is = 10101
 Its decimal equivalent is =21
 ----------------------------------------------*/