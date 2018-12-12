#include<stdio.h>
void main()
{
clrscr();
mystery();
getch();
}
mystery()
{
int c;
if((c=getchar())!=EOF)
{
mystery();
putchar(c);
}
return 0;
}