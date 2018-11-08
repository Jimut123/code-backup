import java.io.*;
class stack
{
BufferedReader Input=new BufferedReader(new InputStreamReader(System.in));
String n;
int i,top,l,m=0;
char st[]=new char[100];
stack()throws IOException
{
System.out.println("Enter The String");
n=Input.readLine();
i=0;
top=-1;
}
void push()
{
if(top>=100)
{
System.out.println(" Over flow");
return;
}
else
{
st[++top]=n.charAt(i);
m++;
i++;
}
}
void pop()
{
if(top<0)
{
System.out.println(" Under Flow");
return;
}
else
{
System.out.println(st[top]);
//m=top;
top--;
i--;
}
}
void display()
{
int i;
for(i=top;i>=0;i--)
{
System.out.println(st[i]);
}
}
void input()throws IOException
{
int k;
do
{
System.out.println("Enter 1 for Push");
System.out.println("Enter 2 for Pop");
System.out.println("Enter 3 for Disply");
System.out.println("Enter 4 for Exit");
System.out.println("Enter Your Choice 1\2\3\4");
k=Integer.parseInt(Input.readLine());
switch(k)
{
case 1:
{
push();
break;
}
case 2:
{
pop();
break;
}
case 3:
{
display();
break;
}
case 4:
{
System.exit(0);
break;
}
default:
{
System.out.println("Enter Correct Value");
}
}
}
while(true);
}
}