/*************************To extract the substring of  given string*********
*********************************By---- Jimut Bahan Pal*********************
***************************************************************************/
#include<stdio.h>
void main()
{
char s[50],s1[50];
int i,n,m,c=0;
clrscr();
printf("Enter the String please ::");
gets(s);
printf("Enter the position from where to extract the string:");
scanf("%d",&n);
printf("Enter the length of the sub-String ::");
scanf("%d",&m);
for(i=n;i<n+m+1;i++)
{
s1[c++]=s[i];         //extraction in progress
}
puts(s1);    //printing the string or most probably the word
getch();
}