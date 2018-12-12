#include<stdio.h>
char stack[100],output[100];
int st=0,ot=0;
char s[100];
int priority(char);
void stack(char);
void output(char);
void main()
{
int i;
char c;
clrscr();
printf("Enter a string :");
gets(s);
for(i=0;i<strlen(s);i++)
{
if(s[i]=='('||s[i]==')'||s[i]=='+'||s[i]=='-'||s[i]=='/'||s[i]=='*'||s[i]=='^')
stack(s[i]);
else
output(s[i]);
}

getch();
}
void stack(char c)
{
stack[st++]=c;
priority(char );
}
void output()
{
}
int priority(char)
{

}