package iisscc;
import java.util.Scanner;
class menu
{
public static void main()
{
Scanner ob=new Scanner(System.in);
recvry_q n=new recvry_q();
do
{
System.out.println("press 1 for insert \npress 2 for delete \npress 3 for display \npress 4 for exit\n");
int x=ob.nextInt();
System.out.println("");
switch(x)
{
case 1: n.insert();
        break;
case 2: n.del();        
        break;
case 3: n.disp();
        break;
case 4: System.exit(0);
default: System.out.println("give input from among the menu integers............\n");
}
}while(true);
}
}
