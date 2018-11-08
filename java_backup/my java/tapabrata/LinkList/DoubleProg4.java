package LinkList;
import java.util.*;
class DoubleProg4
{
public static void main()
{
int ans=1;
int num=0;
Scanner ob=new Scanner(System.in);
DoubleLinkedList4 ob1=new DoubleLinkedList4();
do
{
System.out.println("enter the number : ");
num=ob.nextInt();
System.out.println("1 to insert from first \n2 to insert from last ");
ans=ob.nextInt();
if(ans==1)
ob1.Insert1(num);
else
if(ans==2)
ob1.Insert2(num);
else
System.out.println("Wrong input ");
System.out.println("start again");
System.out.println("1 to continue 0 to exit ");
ans=ob.nextInt();
}while(ans==1);
do
{
System.out.println(" 1 to display from last  2 to display from first   3 to exit  ");
ans=ob.nextInt();
if(ans==1)
ob1.display1();
else
if(ans==2)
ob1.display2();
else
System.exit(0);
}while(ans==1 || ans==2);
}
}
