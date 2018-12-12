#include<stdio.h>
#include<conio.h>
void main()
{
  char ch[20],*c;
  int strlen1();
  int *l;
  clrscr();
  printf("Enter a String ::");
  gets(ch);
  *l=strlen1(&ch);
  printf("%d",l);
  getch();
}
int strlen1(char *ch1)
{
	int *i;
	for(i=ch1;i!='\0';i++,ch1++)
	return i;
}

