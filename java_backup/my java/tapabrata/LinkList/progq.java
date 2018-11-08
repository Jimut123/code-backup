package LinkList;

import java.util.*;
class progq
{
public static void main(String args[])
{
int x;
Scanner ob=new Scanner(System.in);
queue ob1=new queue();
do
{
System.out.println("\npress 1 for insert \npress 2 for delete \npress 3 for display \npress 4 for exit\n");
x=ob.nextInt();
System.out.println("");
switch(x)
{
case 1: ob1.insert();
        break;
case 2: ob1.delete();        
        break;
case 3: ob1.disp();
        break;
case 4: System.exit(0);
default: System.out.println("give input from among the menu ");
}
}while(true);
}
}
