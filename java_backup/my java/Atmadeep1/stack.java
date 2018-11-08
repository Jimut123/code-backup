import java.io.*;
class stack
{
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
int a[]=new int[100];
int top,i,k;
stack()
{
top=-1;
}
void push()throws IOException
{
if(top>99)
System.out.println("Stack overflow");
else
{
a[++top]=Integer.parseInt(input.readLine());
}
}
void pop()
{
System.out.println(a[top]);
top--;
}
void display()
{
for(i=top;i>=0;i--)
System.out.println(a[i]);
}
void input()throws IOException
{
do
{
System.out.println("Press 1 for PUSH");
System.out.println("Press 2 for POP");
System.out.println("Press 3 for DISPLAY");
System.out.println("Press 4 for Exit");
System.out.println("Enter value");
k=Integer.parseInt(input.readLine());
switch(k)
{
case 1: push();
        break;
case 2: pop();
        break;
case 3: display();
        break;
case 4: System.exit(0);
}
}while(true);
}        
}
