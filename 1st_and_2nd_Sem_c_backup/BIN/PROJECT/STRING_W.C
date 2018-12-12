/**********************************************************
 Statement - check if a string is a subsequence of another string
 Programmer - Vineet Choudhary
 Written For - https://turboc.codeplex.com
 **********************************************************/
 
 /*
 C program to check Subsequence, don't confuse subsequence with substring. 
 In our program we check if a string is a subsequence of another string. 
 User will input two strings and we find if one of the strings is a 
 subsequence of other. Program prints yes if either first string is a 
 subsequence of second or second is a subsequence of first. We pass smaller 
 length string first because our function assumes first string is of smaller 
 or equal length than the second string.
 */
 
#include <stdio.h>
#include <string.h>
#include <conio.h>

int check_subsequence (char [], char[]);
 
void main () {
   int flag;
   char s1[1000], s2[1000];
   clrscr();

   printf("Input first string\n");
   gets(s1);

   printf("Input second string\n");
   gets(s2);

   /** Passing smaller length string first */

   if (strlen(s1) < strlen(s2))
      flag = check_subsequence(s1, s2);
   else
      flag = check_subsequence(s2, s1);

   (flag)?printf("YES\n"):printf("NO\n");

   getch();
}

int check_subsequence (char a[], char b[]) {
   int c, d;
 
   c = d = 0;
 
   while (a[c] != '\0') {
      while ((a[c] != b[d]) && b[d] != '\0') {
         d++;
      }
      if (b[d] == '\0')
         break;
      d++;
      c++;
   }
   if (a[c] == '\0')
      return 1;
   else
      return 0;
}

/*
The logic of function is simple we keep on comparing characters of two strings, 
if mismatch occur then we move to next character of second string and if characters 
match indexes of both strings is increased by one and so on. If the first string ends 
then it is a subsequence otherwise not.
*/