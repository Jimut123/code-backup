/******* To delete a string within a string .... by entering the position ***
********************** by --- Jimut Bahan Pal *******************************
****************************************************************************/
#include<stdio.h>
void main()
{
char s[50],s1[50],s2[50];
int l,ls,n1,n2,i,c=0,o,v;
clrscr();
printf("Enter the two Strings ::");
scanf("%[^\n] %[^\n]",s,s1);
l=strlen(s);
ls=strlen(s1);
for(i=0;i<l;i++)
{
if(s[i]==s1[0])
{
s2[i]=s[i];
v=i;
break;
}
}
c=v;
for(i=v;i<l;i++)
{
if(s[i]!=s1[ls-1])
{
o=i;
break;
}
}
for(i=o;i<l;i++)
{
s2[c++]=s[i];
}
puts(s2);
getch();
}