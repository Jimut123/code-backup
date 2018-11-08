package LinkList;
import java.util.*;
class Prog2
{
public static void main()
{
int num;
Scanner ob=new Scanner(System.in);
LinkedList2 ob1=new LinkedList2();
System.out.println(" enter the number : ");
num=ob.nextInt();
while(num>0)
{
int k=num%10;
ob1.Insert(k);
num=num/10;
}
ob1.display();
ob1.maximum();
}
}
