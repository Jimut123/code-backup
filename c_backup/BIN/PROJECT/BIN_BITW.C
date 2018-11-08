/**********************************************************
 Statement - Convert number to binary using bitwise operators
 Programmer - Vineet Choudhary
 Written For - https://turboc.codeplex.com
 **********************************************************/

#include<stdio.h>
#include<conio.h>

//Display integer number into binary using bitwise operator
void printBinary(int num)
{
    int mask = 0x4000;
    if ((num & 0x8000) == 0)
        printf("0");
    else
        printf("1");
    while (mask != 0) {
        if ((num & mask) == 0)
            printf("0");
        else
            printf("1");
        mask = mask >> 1;
    }
}

void main()
{
    int intNum;
    clrscr();
    
    printf("\nEnter a integer number :");
    scanf("%d", &intNum);
    
    printf("\nInteger number in binary format :");
    printBinary(intNum);
    
    getch();
}
