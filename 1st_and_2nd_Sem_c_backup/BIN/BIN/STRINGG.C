#include<stdio.h>
void main()
{
char a[100],ch,ch1;
int uc=0,lc=0,wrd=0,v=0,c=0,sp;
int i;
clrscr();
printf("Enter the String ::\n");
gets(a);
for(i=0;a[i]!='\0';i++)
{
ch=a[i];
if(((int)ch>=65) && ((int)ch<=90))
uc++;
if(((int)ch>=97) && ((int)ch<=122))
lc++;
if((ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U')||(ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
v++;
else
c++;
}
for(i=0;a[i]!='\0';i++)
{
ch=a[i];
ch1=a[i+1];
if(ch==' ' && ch1!=' ')
wrd++;
}
printf("No. of vowels : %d\n no. of consonants : %d\n no. of words : %d\n no. of Upper case : %d\n no. of Lower Case : %d",v,c,wrd,uc,lc);
getch();
}