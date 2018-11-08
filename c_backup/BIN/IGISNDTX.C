#include<stdio.h>
#include<dos.h>
#include<conio.h>
#include<stdlib.h>
void main()
{
char s[100]={"Anya : Jones! our top priority is to find the bomb..."};
int i,l;
l=strlen(s);
clrscr();
for(i=0;i<l;i++)
{
printf("%c",s[i]);
sound(600);
delay(100);
nosound();
delay(30);
sound(100);
delay(20);
nosound();
}
getch();
}