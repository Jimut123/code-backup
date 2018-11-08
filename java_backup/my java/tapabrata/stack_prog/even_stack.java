package stack_prog;

import java.util.Scanner;
class even_stack
{
Scanner ob=new Scanner(System.in);
int top,i,e,x,f;
int s[]=new int [100];
even_stack()
{
top=-1;
i=0;
e=1;
}
int even(int e)
{
f=0;
for(i=0;i<e;i++)
if(e%2==0)
{
f=1;
break;
}
if(f==1)
return 0;
else
return 1;
}
void push()
{
if(top>=100)
System.out.println("overflow");
else
{
while(true)
if(even(e)==0)
{
System.out.println(e+" was pushed :");
s[++top]=e;
e++;
break;
}
else
e++;
}
System.out.println("");
}
void pop()
{
System.out.println("popped element = " +s[top]);
e--;
top--;
}
void disp()
{
System.out.println("your stack :");
for(i=top;i>=0;i--)
System.out.print(s[i]+", ");
System.out.println("");
}

void menu()
{
do
{
System.out.println("press 1 for push ");
System.out.println("press 2 for pop ");
System.out.println("press 3 for display ");
System.out.println("press 4 for exit ");
System.out.println("enter choice ");
x=ob.nextInt();
System.out.println("");
switch(x)
{
case 1: push();
        break;
case 2: pop();        
        break;
case 3: disp();
        break;
case 4: System.exit(0);
default :System.out.println("Invalid choice!!!!!!!!!!!!!!Choose from the given menu");
}
}while(true);
}
}
