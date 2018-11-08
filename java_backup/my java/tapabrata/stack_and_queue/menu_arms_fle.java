package stack_and_queue;
import java.io.*;
import java.util.Scanner;
class menu_arms_fle
{
public static void main()throws IOException
{
Scanner ob=new Scanner(System.in);
armstrong_fle n=new armstrong_fle();
do
{
System.out.println("press 1 for push \npress 2 for pop \npress 3 for display of stack \npress 4 for storing all armstrong numbers in a file \npress 5 for display of file \npress 6 for exit\n");
int x=ob.nextInt();
System.out.println("");
switch(x)
{
case 1: n.push();
        break;
case 2: n.pop();        
        break;
case 3: n.disp();
        break;
case 4: n.check();
        break;
case 5: n.fle_disp();
        break;        
case 6: System.exit(0);
default: System.out.println("give input from among the menu integers ");
}
}while(true);
}
}


