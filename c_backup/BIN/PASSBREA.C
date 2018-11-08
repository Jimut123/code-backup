#include<stdio.h>
void main()
{
char c[256];
int i,k,p=0;
clrscr();
printf("CRACK::");
//for()
for(i=32;i<=126;i++)
{
printf("%c",c[p]);
c[p++]=(char)i;
}
getch();
}