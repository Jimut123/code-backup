import java.io.*;
class employeesalarycount
{
int pan;
double taxincome,tax;
String name;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
public  void main(String args[])throws IOException
{
System.out.println("ENTER PAN");
pan=Integer.parseInt(br.readLine());
System.out.println("ENTER TAXINCOME");
taxincome=Double.parseDouble(br.readLine());
System.out.println("ENTER NAME");
name=br.readLine();
calc();
disp();
}
void calc()
{
if(taxincome<=100000)
{
tax=0;
}
if(taxincome>100000&&taxincome<=150000)
{
tax=(0.1*taxincome);
}
if(taxincome>150000&&taxincome<=250000)
{
tax=5000+(0.2*taxincome);
}
if(taxincome>250000)
{
tax=25000+(0.3*taxincome);
}
}
void disp()
{
System.out.println("NAME"+name);
System.out.println("TAX INCOME"+taxincome);
System.out.println("CALCULATEDTAX"+tax);
}
}