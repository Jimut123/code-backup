import java.io.*;
class QueCall2
{
public static void main(String args[])throws IOException
{
int n;
que2 q2=new que2();
do
{
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println();
System.out.println("----MENU----");
System.out.println("Press 1 to input");
System.out.println("Press 2 to insert element at front");
System.out.println("Press 3 to insert element at rear");
System.out.println("Press 4 for deletion from front");
System.out.println("Press 5 for deletion from rear");
System.out.println("Press 6 to display the que");
System.out.println("Press 7 to exit");
System.out.println("Enter your choice");
n=Integer.parseInt(input.readLine());
switch(n)
{
case 1:q2.input();
       break;
case 2:q2.insert_front();
       break;
case 3: q2.insert_rear();
        break;
case 4: q2.delete_front();
        break;
case 5: q2.delete_rear();
        break;        
case 6: q2.disp();
        break;
case 7: System.exit(0);
default:System.out.println("Press only 1/2/3/4/5/6/7 :");
}
}while(true);
}
}        