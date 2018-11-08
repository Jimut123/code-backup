import java.io.*;
public class employee
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
String Name,Dep;
int code,sal;
public void accept()throws IOException
{

System.out.println("Enter the Name");
Name=in.readLine();
System.out.println("Enter the Code");
code=Integer.parseInt(in.readLine());
System.out.println("Enter the Department");
Dep=in.readLine();
System.out.println("Enter the Basic Salary");
sal=Integer.parseInt(in.readLine());
}
public void disp()
{
System.out.println("The Name is="+Name);
System.out.println("The code is="+code);
System.out.println("The Department is="+Dep);
System.out.println("The Salary is="+sal);
}
}
