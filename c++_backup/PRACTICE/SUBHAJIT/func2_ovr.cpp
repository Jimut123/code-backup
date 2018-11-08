#include <iostream.h>
 
/* Number of arguments are different */
 
void display(char []);  	// print the string passed as argument
void display(char [], char []);

void main()
{
   char first[] = "C programming";
   char second[] = "C++ programming";
   display(first);
   display(first, second);
}
 
void display(char s[])
{
   cout << s << endl;
}
 
void display(char s[], char t[])
{
   cout << s << endl << t << endl;
}