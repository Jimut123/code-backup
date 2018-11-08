/*************************To extract the 1st n characters of the string*****
*********************************By---- Jimut Bahan Pal*********************
***************************************************************************/
#include<stdio.h>
void main()
{
char s[50],s1[50];
int i,l,n;
clrscr();
printf("Enter the String please ::");
gets(s);
printf("Enter the no. of first character that are to be extracted from the string:");
scanf("%d",&n);
for(i=0;i<n;i++)
{
s1[i]=s[i];         //extraction in progress
}
printf("%s",s1);    //printing the string or most probably the word
getch();
}