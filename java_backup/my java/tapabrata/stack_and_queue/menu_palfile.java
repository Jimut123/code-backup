package stack_and_queue;
import java.io.*;
import java.util.Scanner;
class menu_palfile
{
public static void main()throws IOException
{
Scanner ob=new Scanner(System.in);
palprme_fle n=new palprme_fle();
do
{
System.out.println("\npress 1 for display file \npress 2 for push \npress 3 for display of stack \npress 4 for exit\n");
int x=ob.nextInt();
System.out.println("");
switch(x)
{
case 1: n.fle_disp();        
        break;
case 2: n.push();
        break;
case 3: n.disp();
        break;
case 4: System.exit(0);
default: System.out.println("give input from among the menu integers");
}
}while(true);
}
}
