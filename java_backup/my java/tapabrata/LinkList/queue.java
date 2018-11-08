package LinkList;

import java.util.Scanner;
class queue
{
Scanner ob=new Scanner(System.in);
linkdlstq ob1=new linkdlstq();
int num;
void insert()
{
System.out.println("enter the number : ");
num=ob.nextInt();
ob1.Insert(num);
}
void delete()
{
ob1.delete();
}
void disp()
{
if(ob1.isEmpty()!=true)
ob1.display();
else
System.out.println("empty");
}
}
