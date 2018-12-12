#include<stdio.h>
char s[10000],stack[100];
int top=-1;
void push(char);
int main()
{
int i,v=98,k=0,p=0,c0;
char ch;
//clrscr();
gets(s);

for(i=0;s[i]!='\0';i++)
{
ch=s[i];
if(top==-1&&(s[i]=='}'||s[i]==']'||s[i]==')'))
{
printf("%d",i+1);
break;
}
if(s[i]=='('||s[i]=='{'||s[i]=='[')
{
push(ch);
p=i;
}
else if(s[i]==')'&&stack[top]=='(')
{
v=0;
//printf("%dttt",v);
top--;
}
else if(s[i]=='}'&&stack[top]=='{')
{
v=0;
//printf("%dttt",v);
top--;
}
else if(s[i]==']'&&stack[top]=='[')
{
v=0;
//printf("%dttt",v);
top--;
}
else if(s[i]==')'&&stack[top]!='('&&top!=-1)
{
k=i+1;
//printf("%dnnn",v);
v=1;
break;
}
else if(s[i]==')'&&stack[top]!='('&&top==-1)
{
c0=i+1;
v=7;
break;
}
else if(s[i]=='}'&&stack[top]!='{'&&top==-1)
{
c0=i+1;
v=7;
v=1;
//printf("%dnnn",v);
break;
}
else if(s[i]==']'&&stack[top]!='['&&top==-1)
{
c0=i+1;
v=7;
v=1;
//printf("%dnnn",v);
break;
}


}

/*if(top>0)
{
printf("%d",p);
}*/
if(v==1)
{
printf("%d",k);
}
if(v!=1)
{
for(i=0;i<=top;i++)
if(stack[i]!=')'&&stack[i]!=']'&&stack[i]!='}')
{
v=9;
}
if(v==9)
printf("%d",p+1);
}
if(v==7)
printf("%d",c0);
if(v==0)
{
printf("Success");
}


//getch();
return 0;
}
void push(char ch)
{
stack[++top]=ch;
}