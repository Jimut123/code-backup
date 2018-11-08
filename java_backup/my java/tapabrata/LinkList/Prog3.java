package LinkList;


import java.io.*;
class Prog3
{
public static void main()throws IOException
{
int ans=1;
int roll=0;
String name="";
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
LinkedList3 ob=new LinkedList3();
do
{
System.out.println("\nenter the student roll number : ");
roll=Integer.parseInt(br.readLine());
System.out.println("\nenter the student name : ");
name=br.readLine();
ob.Insert(roll,name);
System.out.println("\n1 to continue \n0 to exit\n");
ans=Integer.parseInt(br.readLine());
}while(ans==1);
ob.display();
}
}
