import java.io.*;
class switchQue
{
public static void main(String args[])throws IOException
{
int n;
que1 q=new que1();
do
{
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("----MENU----");
System.out.println("Press 1 to input");
System.out.println("Press 2 to delete");
System.out.println("Press 3 to display");
System.out.println("Press 4 to exit");
System.out.println("Enter your choice");
n=Integer.parseInt(input.readLine());
switch(n)
{
case 1:q.input();
       break;
case 2:q.delete();
       break;
case 3: q.disp();
        break;
case 4: System.exit(0);
}
}while(true);
}
}        