/*******************************************************
 Statement - Substring
 Programmer - Vineet Choudhary
 Written For - https://turboc.codeplex.com
 *******************************************************/

#include <stdio.h>
#include <conio.h>

void main()
{
    char string[1000], sub[1000];
    int position, length, c = 0;
    clrscr();
    
    printf("Input a string\n");
    gets(string);
    
    printf("Enter the position and length of substring\n");
    scanf("%d%d", &position, &length);
    
    while (c < length) {
        sub[c] = string[position+c-1];
        c++;
    }
    sub[c] = '\0';
    
    printf("Required substring is \"%s\"\n", sub);
    
    getch();
}