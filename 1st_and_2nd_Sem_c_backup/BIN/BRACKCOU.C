#include<stdio.h>
char s[10000],stack[100];
void push(char);
int top=-1;
void main()
{
int i,k=0;
char ch;
clrscr();
printf("Enter the string :");
gets(s);
for(i=0;s[i]!='\0';i++)
{
ch=s[i];
if(ch=='('||ch=='{'||ch=='[')
push(ch);
else if((ch==')'&&stack[top]=='(')||
   (ch==']'&&stack[top]=='[')||
   (ch=='}'&&stack[top]=='{'))
top--;
else if((ch==')'&&stack[top]!='(')||
   (ch==']'&&stack[top]!='[')||
   (ch=='}'&&stack[top]!='{'))
{
k=i;
break;
}
}
if(top>-1)
printf("%d",k+1);
else
printf("Success");
getch();
}
void push(char ch)
{
stack[++top]=ch;
}