package stack_and_queue;
import java.io.*;
import java.util.Scanner;
class menu_stk_q_fle
{
public static void main()throws IOException
{
Scanner ob=new Scanner(System.in);
stk_q_fle n=new stk_q_fle();
do
{
System.out.println("press 1 for push \npress 2 for pop  \npress 3 for display of stack \npress 4 for isertion \npress 5 for deletion \npress 6 for display of queue  \npress 7 for storing elements in the file \npress 8 for display of the file\npress 9 for exit\n");
System.out.println(" Enter choice ");
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
case 4: n.insert();
        break;
case 5: n.del();
        break;        
case 6: n.display();
        break;
case 7: n.check();
        break;
case 8: n.fle_disp();
        break;        
case 9: System.exit(0);
default: System.out.println("give input from among the menu integers ");
}
}while(true);
}
}


