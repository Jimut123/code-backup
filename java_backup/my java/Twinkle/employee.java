import java.io.*;
class employee
{
String ename;
double basic;
String ecode;

BufferedReader input=new BufferedReader(new InputStreamReader(System.in));

void input()throws IOException
{
System.out.println("Enter employee name:");
ename=input.readLine();
System.out.println("Enter employee's basic pay:");
basic=Double.parseDouble(input.readLine());
System.out.println("Enter employee code:");
ecode=input.readLine();
disp();
}
void disp()
{
System.out.println("Employee name: "+ename);
System.out.println("Employee's basic pay: "+basic);
System.out.println("Employee code: "+ecode);
}
}
