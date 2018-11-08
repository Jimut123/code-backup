 package stack_prog;

import java.util.Scanner;
class string_stack
{
Scanner ob=new Scanner(System.in);
int top,i,k,x;
String s="";
char arr[]=new char [100];
string_stack()
{
System.out.println("Give the string :");
s=ob.nextLine();
top=-1;
i=0;
k=0;
}
void push()
{
System.out.println("the '"+s.charAt(k)+"' letter was pushed");
System.out.println("");
if(top>=100)
System.out.println("overflow");
else
{
arr[++top]=s.charAt(k);
k++;
}
}
void pop()
{
System.out.println("popped element = " +arr[top]);
k--;
top--;
}
void disp()
{
System.out.println("your stack :");
for(i=top;i>=0;i--)
System.out.print(arr[i]+", ");
System.out.println("");
}
void menu()
{
do
{
System.out.println("press 1 for push ");
System.out.println("Press 2 for pop ");
System.out.println("Press 3 for display ");
System.out.println("Press 4 for exit ");
System.out.println("Enter choice ");
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
default: System.out.println("Invalid choice!!!!!!!!!!!!!!!!!!!Choose from the menu");
}
}while(true);
}
}
