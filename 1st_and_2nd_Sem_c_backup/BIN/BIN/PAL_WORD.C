/*****************************To Check whether palindrome or not ***********
****************************** Created by ----- JIMUT BAHAN PAL  ***********
***************************************************************************/
#include<stdio.h>
void main()
{
char s[10],i,s1[1],c=0;
clrscr();
printf("Enter a word ::\n\n");
scanf("%s",s);
for(i=0;i<strlen(s)/2;i++)
{
if(s[i]!=s[strlen(s)-i-1])
break;
}
if(i==(strlen(s)/2))
printf(" yes\n\n");
else
printf(" no\n\n");
for(i=strlen(s)-1;i>=0;i--)
{
s1[c++]=s[i];
}
for(i=0;i<strlen(s);i++)
printf(" %c",s1[i]);
getch();
}