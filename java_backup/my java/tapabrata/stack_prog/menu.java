package stack_prog;
import java.util.Scanner;
class menu
{
public static void main()
{
Scanner ob=new Scanner(System.in);
stack_merge s=new stack_merge();
do
{
System.out.println("press 1 for push stack a \npress 2 for pop stack a ");
System.out.println("press 3 for push stack b \npress 4 for pop stack b ");
System.out.println("press 5 for merging");
System.out.println("press 6 for push merged stack \npress 7 for pop merged stack ");
System.out.println("press 8 for display merged stack \npress 9 for display stack a \npress 10 for display stack b ");
System.out.println("press 11 for exit\n");
int x=ob.nextInt();
System.out.println("");
switch(x)
{
case 1: s.push1();
        break;
case 2: s.pop1();        
        break;
case 3: s.push2();
        break;
case 4: s.pop2();        
        break;
case 5: s.merge();
        break;
case 6: s.push_merge();
        break;
case 7: s.pop_merge();        
        break;        
case 8: s.disp_merge();
        break;
case 9: s.disp_1();
        break;        
case 10: s.disp_2();
        break;    
case 11: for(int j=1;j<=33;j++)
         {
         System.out.print("*");
         try
         {
         Thread.sleep(15);
         }
         catch(Exception e)
         {}
         }
         
         System.exit(0);
default: System.out.println("give input from among the menu integers............\n");
}
}while(true);
}
}

