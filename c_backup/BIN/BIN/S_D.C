/******* To delete a string within a string .... by entering the position ***
********************** by --- Jimut Bahan Pal *******************************
****************************************************************************/
#include<stdio.h>
void main()
{
char s[50],s1[50];
int l,n1,n2,i,c=0;
clrscr();
printf("Enter the String ::");
scanf("%[^\n]",s);
printf("Enter the two positions :");
scanf("%d",&n1);
scanf("%d",&n2);
l=strlen(s);
for(i=0;i<n1;i++)
s1[i]=s[i];
c=n1;
for(i=n2;i<l;i++)
s1[c++]=s[i];
puts(s1);
getch();
}