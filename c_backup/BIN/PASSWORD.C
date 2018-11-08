#include<stdio.h>
void main()
{
char s[10];
int i=0;
clrscr();
printf("Enter the password ::");
while(i<10)
{
s[i++]=getch();
printf("*");
}
printf("\n");
puts(s);
getch();
}