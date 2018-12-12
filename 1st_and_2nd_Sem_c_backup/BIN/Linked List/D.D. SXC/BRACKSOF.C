#include<stdio.h>
char s[10000],stack[100];
void push(char);
int top=-1;
int main()
{
int i,k=0,v=12,p=0;
char ch;
//clrscr();
//printf("Enter the string :");
gets(s);
for(i=0;s[i]!='\0';i++)
{
ch=s[i];
if(ch=='('||ch=='{'||ch=='[')
{
k=i;
push(ch);
}
else if((ch==')'&&stack[top]=='(')||
   (ch==']'&&stack[top]=='[')||
   (ch=='}'&&stack[top]=='{'))
{
top--;
}
else if((ch==')'&&stack[top]!='('&&top==-1)||
   (ch==']'&&stack[top]!='['&&top==-1)||
   (ch=='}'&&stack[top]!='{'&&top==-1))
{
v=10;                      //checks whether ( or )
p=i;
break;
}
else if((ch==')'&&stack[top]!='(')||
   (ch==']'&&stack[top]!='[')||
   (ch=='}'&&stack[top]!='{'))
{
k=i;
break;                                 // checks whether {[}
}
}
if(v==10)
printf("%d",p+1);
if(top>-1)
printf("%d",k+1);
if(v==12&&top==-1)
printf("Success");
//getch();
return 0;
}
void push(char ch)
{
stack[++top]=ch;
}