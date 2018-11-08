import java.io.*;
class EMPLOYEE
{
String name;
String designation;
String dept;
int basic;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
void employee()throws IOException
{
System.out.println("enter name");
name=br.readLine();
System.out.println("enter designation");
designation=br.readLine();
System.out.println("enter dept");
dept=br.readLine();
System.out.print("enter salary");
basic=Integer.parseInt(br.readLine());
}
void dispaly()
{
System.out.println(name);
System.out.print(designation);
System.out.print(dept);
System.out.print(basic);
}
}
