#include"stdio.h"
#include"conio.h"
#include"ctype.h"
int top=-1;
char stack[100];
char a[100];
char b[100];
int i,j,k,p,p1;
void push(char );
char pop();
int priority(char);
int main()
{
//clrscr();
printf("\n Give Expression:");
gets(a);
k=0;
for(i=0;a[i];i++)
{
 if(isalpha(a[i])!=0||isdigit(a[i])!=0)
  b[k++]=a[i];
 else
 if(a[i]=='(')
 {
 push(a[i]);
 }
 else
 push(a[i]);

}
printf("\n dd2 %d",top);
while(top>=0)
 {
 b[k++]=pop();
 top--;
 }
 k++;
 b[k]='\0';
 printf("\n The Expression in postfix form s %s",b);
 getch();
 return 0;
}
void push(char ch)
{
p=p1=0;
if(ch=='(')
{
stack[++top]=ch;
}
else
if(ch==')')
{
while(stack[top]!='(')
{
b[k++]=pop();
}
top--;
}
else
{
p=priority(ch);
printf("\n dd %d",p);
if(top>=0)
{
p1=priority(stack[top]);
printf("\n dd %d",p1);
}
if(p>p1)
{
//b[k++]=pop();
stack[++top]=ch;
}
else
{
b[k++]=pop();
stack[++top]=ch;
}
}
}
char pop()
{
return stack[top--];
}
int priority(char ch)
{
if(ch=='^')
 return 7;
else
 if(ch=='/')
 return 6;
else
if(ch=='*')
 return 5;
else
if(ch=='+')
 return 4;
else
if(ch=='-')
 return 3;
else
 return 2;
}


































































































































































































































































































































































































































































