/*******************************************************
 Statement - Padding strings to a fixed length
 Programmer - Vineet Choudhary
 Written For - https://turboc.codeplex.com
 *******************************************************/

#include <stdio.h>
#include <conio.h>

char *data[25] = {
    "REGION", "---Q1---",    "---Q2---",   "---Q3---", "---Q4---",
    "North", "10090.50", "12200.10", "26653.12", "62634.32",
    "South", "21662.37", "95843.23", "23788.23", "48279.28",
    "East", "23889.38", "23789.05", "89432.84", "29874.48",
    "West", "85933.82", "74373.23", "78457.23", "28799.84" };
void main(void)
{
    int x;
    clrscr();
    
    for (x=0; x<25; x++)
    {
        if ((x % 5) == 0 && (x != 0))
        {
            printf("\n");
        }
        printf("%-10.10s", data[x]);
    }
    getch();
}

/*
 In this example, a character array (char* data[]) is filled with this year's sales data for four regions. Of course, you would want to print this data in an orderly fashion, not just print one figure after the other with no formatting. This being the case, the following statement is used to print the data:
 
 printf("%-10.10s", data[x]);
 
 The "%-10.10s" argument tells the printf() function that you are printing a string and you want to force it to be 10 characters long. By default, the string is right-justified, but by including the minus sign (-) before the first 10, you tell the printf() function to left-justify your string. This action forces the printf() function to pad the string with spaces to make it 10 characters long.
 
 */