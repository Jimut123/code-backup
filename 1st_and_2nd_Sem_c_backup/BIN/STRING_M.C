/********************** To reverse the word as it is ************************
*********************** By -- Jimut Bahan Pal        ************************
*****************************************************************************/
#include<stdio.h>
void main()
{
char s[100],s1[100];
int i,l,k,p;
int j=0;
clrscr();
printf("Enter a String(Add a space before the string please) ::");
gets(s);
/*s[0]='\0';
l=strlen(s1);
for(i=0;i<l;i++)
{
s[c]=s1[i];
printf("%c",s[c]);
c++;
} */
l=strlen(s);
for(i=l;i>=0;i--)
{
k=i;
//r++;
/*if(r>2)
{
k--;
} */
for(j=k;(s[j]!=' '&&s[j]!='\0'&&j!=0);j--,i--);
for(p=i;p<=k;p++)
{
printf("%c",s[p]);
}
printf("%c",' ');
//printf("j = %d i = %d k = %d",j,i,k);
}
//printf(" r = %d",r);
getch();
}