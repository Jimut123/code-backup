/********************** To reverse the word as it is ************************
*********************** By -- Jimut Bahan Pal        ************************
*****************************************************************************/
#include<stdio.h>
void main()
{
char s[100];
int i,l,k,p;
int j=0;
clrscr();
printf("Enter a String ::");
gets(s);
l=strlen(s);
for(i=0;i<l;i++)
{
k=j;
//r++;
/*if(r>2)
{
k--;
} */
for(j=i;(s[j]!=' '&&s[j]!='\0');j++,i++);
for(p=i;p>=k;p--)
{
printf("%c",s[p]);
}
printf("%c",' ');
//printf("j = %d m = %d i = %d k = %d",j,m,i,k);
}
//printf(" r = %d",r);
getch();
}