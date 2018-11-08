/******* To insert a string within a string .... by entering the position ***
********************** by --- Jimut Bahan Pal *******************************
****************************************************************************/
#include<stdio.h>
void main()
{
char s[50],s1[50],s2[50];
int l1,l2,n,i,c=0;
clrscr();
printf("Enter the two Strings one followed by enter and then the another ::");
scanf("%[^\n]  %[^\n]",s,s1);
printf("Enter the position :");
l1=strlen(s);
l2=strlen(s1);
scanf("%d",&n);
for(i=0;i<n;i++)
s2[i]=s[i];
c=n;
for(i=0;i<l2;i++)
s2[c++]=s1[i];
for(i=n;i<l1;i++)
s2[c++]=s[i];
puts(s2);
getch();
}