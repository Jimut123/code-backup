#include<stdio.h>
char s[200000],stack[200000],pos[200000];
void push(char,int);
int top=-1;
int main()
{
int i,k=0,p,v=1,l=1,o;
char ch;
//clrscr();
//printf("Enter the string :");
gets(s);
for(i=0;s[i]!='\0';i++)
{
ch=s[i];
if(ch=='('||ch=='{'||ch=='[')
{
k=i+1;
push(ch,k);
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
l=0;
o=i+1;
break;
}
else if((ch==')'&&stack[top]!='(')||
   (ch==']'&&stack[top]!='[')||
   (ch=='}'&&stack[top]!='{'))
{
p=i+1;
v=0;
break;                                 // checks whether {[}
}
}

if(l==0)
printf("%d",o);
if(v==0)
printf("%d",p);
if(top>-1&&v==1&&l==1)
{
printf("%d",pos[top]);
}
if(top==-1&&l==1)
printf("Success");

return 0;
}
void push(char ch,int posi)
{
++top;
stack[top]=ch;
pos[top]=posi;
}
