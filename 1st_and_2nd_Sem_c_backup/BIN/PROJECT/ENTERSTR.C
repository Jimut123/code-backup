/*******************************************************
Statement - Insert substring into a string
Programmer - Vineet Choudhary
Written For - https://turboc.codeplex.com
*******************************************************/

#include <stdio.h>
#include <conio.h>
#include <string.h>
#include <stdlib.h>
 
void insert_substring(char*, char*, int);
char* substring(char*, int, int);
 
void main()
{
   char text[100], substring[100];
   int position;
   clrscr();

   printf("Enter some text\n");
   gets(text);
 
   printf("Enter the string to insert\n");
   gets(substring);
 
   printf("Enter the position to insert\n");
   scanf("%d", &position);
 
   insert_substring(text, substring, position);
 
   printf("%s\n",text);
 
   getch();
}
 
void insert_substring(char *a, char *b, int position)
{
   char *f, *e;
   int length;
 
   length = strlen(a);
 
   f = substring(a, 1, position - 1 );      
   e = substring(a, position, length-position+1);
 
   strcpy(a, "");
   strcat(a, f);
   free(f);
   strcat(a, b);
   strcat(a, e);
   free(e);
}
 
char *substring(char *string, int position, int length) 
{
   char *pointer;
   int c;
 
   pointer = malloc(length+1);
 
   if( pointer == NULL )
       exit(EXIT_FAILURE);
 
   for( c = 0 ; c < length ; c++ ) 
      *(pointer+c) = *((string+position-1)+c);       
 
   *(pointer+c) = '\0';
 
   return pointer;
}