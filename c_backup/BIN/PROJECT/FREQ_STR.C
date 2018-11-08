/*******************************************************
 Statement - Print Diamond
 Programmer - Vineet Choudhary
 Written For - https://turboc.codeplex.com
 *******************************************************/

#include <stdio.h>
#include <string.h>
#include <conio.h>

void find_frequency(char [], int []);

void main()
{
    char string[100];
    int c, count[26] = {0};
    clrscr();
    
    printf("Input a string\n");
    gets(string);
    
    find_frequency(string, count);
    
    printf("Character Count\n");
    
    for (c = 0 ; c < 26 ; c++)
    {
        printf("%c \t  %d\n", c + 'a', count[c]);
    }
    
    getch();
}

void find_frequency(char s[], int count[]) {
    int c = 0;
    
    while (s[c] != '\0') {
        if (s[c] >= 'a' && s[c] <= 'z' )
            count[s[c]-'a']++;
        c++;
    }
}