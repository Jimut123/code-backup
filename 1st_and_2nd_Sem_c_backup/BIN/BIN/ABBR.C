#include<stdio.h>
#include<String.h>
void main()
{
char s[100],s1[100],ch,s2[100],h=0,c;
int i,v=1;
clrscr();
printf("Enter the String ::");
gets(s);
s1[0]=s[0];
for(i=0;s[i]!='\0';i++)
{
ch=s[i];
c=s[i+1];
if(ch==' '&&c!=' ')
s1[v++]=c;
}
for(i=0;i<v-1;i++)
printf("%c%c ",s1[i],'.');
for(i=strlen(s);s[i]!=' ';i--)
{
s2[h++]=s[i];
}
printf("%c",' ');
for(i=h-1;i>=0;i--)
{
printf("%c",s2[i]);
}
getch();
}