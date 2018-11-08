import java.io.*;
class computer
{
String name,address,subject;
long phone;
float salary;
double tax;
void inputdata()throws IOException
{
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader(ab);
System.out.println("Enter the salary::");
salary = Float.parseFloat(cd.readLine());
System.out.println("Enter the name::");
name = cd.readLine();
System.out.println("Enter the address::");
address = cd.readLine();
System.out.println("Enter the specialization::");
subject = cd.readLine();
System.out.println("Enter the phone number::");
phone = Long.parseLong(cd.readLine());
}
void display()
{
System.out.println("Name=="+name);
System.out.println("address=="+address);
System.out.println("Specialization"+subject);
System.out.println("phone number"+phone);
}
void compute()
{
double totalsal;
totalsal = 12.0*salary;
if(totalsal>175000)
{
System.out.println("Annual salary="+totalsal);
tax = (totalsal-175000)*(5.0/100.0);
System.out.println("Annual Income tax is::"+tax);
}
else
{
System.out.println("No tax amounts on this income");
}}
public static void main(String args[])throws IOException
{
computer ob = new computer();
ob.inputdata();
ob.display();
ob.compute();
}
}



































