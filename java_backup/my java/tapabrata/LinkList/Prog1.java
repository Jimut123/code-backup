package LinkList;
import java.util.*;
class Prog1
{
public static void main()
{
int ans=1;
int num=0;
Scanner ob=new Scanner(System.in);
LinkedList1 ob1=new LinkedList1();
do
{
System.out.println("\nenter the number : ");
num=ob.nextInt();
ob1.Insert(num);
System.out.println("\n1 to continue \n0 to exit\n");
ans=ob.nextInt();
}while(ans==1);
ob1.display();
/*while(!ob1.isEmpty())
{
Link ob2=ob1.delete();
System.out.print("deleted");
ob2.display1();
System.out.println("");
}
ob1.display();*/
}
}
