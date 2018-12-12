/*************************To insert a given string from a set of String*****
*********************************By---- Jimut Bahan Pal*********************
***************************************************************************/
#include<stdio.h>
#include<conio.h>
void main()
{
char s[50],s1[50],s2[50];
int i,l,n,c=0,l2;
clrscr();
printf("Enter the String please ::\n");
scanf("%[^\n]",s);
printf("Enter the second String please ::\n");
scanf("%[^\n]",s1);
printf("Enter the position where you will insert the given string::\n");
scanf("%d",&n);
puts(s1);
printf("\n");
puts(s2);
printf("\n");
printf("%d",n);
l2=strlen(s);
l=strlen(s1);
for(i=0;i<n;i++)
{
s2[i]=s[i];
}
c=n;
for(i=n;i<l+n;i++)
{
s2[c++]=s[i];       //extraction in progress
}
for(i=l;i<l2;i++)
{
s2[c++]=s[i];
}
puts(s2);    //printing the string or most probably the word

getch();
}