/*** A program that makes all of its upper case characters to lower case ***
****************** Created by -- JIMUT BAHAN PAL ***************************
***************************************************************************/
#include<stdio.h>
void main()
{
char s[50]="THIS is a Tes Line.Z";      //Sample input
int i,l;
clrscr();
l=strlen(s);         //finds the length of the string
for(i=0;i<l;i++)
{
if(s[i]>=65&&s[i]<=91)     //converting the upper case alphabets to lower case
s[i]=s[i]+32;
}
puts(s);        //printing the sentence
getch();
}