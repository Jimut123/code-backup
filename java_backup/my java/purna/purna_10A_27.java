
import java.io.*;
class purna_10A_27
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
String empid,empname,empadd;
long acc;
double da,hra,ma,otherall,pf,ptax,esi,loan,otherded,gross,ded,netpay,basic;
//to take input
void input()throws IOException
{
System.out.println("enter employee id");
empid=br.readLine();
System.out.println("enter employee name");
empname=br.readLine();
System.out.println("enter adderss");
empadd=br.readLine();
System.out.println("enter account number");
acc=Long.parseLong(br.readLine());
System.out.println("enter basic");
basic=Double.parseDouble(br.readLine());
caladdgross(basic);
}
//to make additions
void caladdgross(double basic)throws IOException
{
da=(basic*16)/100;
hra=(basic*15)/100;
ma=300;
System.out.println("other allowance");
otherall=Double.parseDouble(br.readLine());
gross=basic+da+hra+ma+otherall;
caldedgross(basic,gross);
}
//to make deductions
void caldedgross(double basic,double gross)throws IOException
{
pf=(basic*12.92)/100;
ptax=(basic*0.79)/100;
if(gross<=8000)
{
esi=basic-120;
}
System.out.println("enter loan");
loan=Double.parseDouble(br.readLine());
System.out.println("other deductions");
otherded=Double.parseDouble(br.readLine());
ded=pf+ptax+esi+loan+otherded;
calnetpay();
displaypayslip();
}
//to calculate netpay
void calnetpay()
{
netpay=gross-ded;
}
//to display payslip
void displaypayslip()throws IOException
{
System.out.println("company name");
String nc=br.readLine();
System.out.println("company address");
String ac=br.readLine();
System.out.println("month and year");
String date=br.readLine();
System.out.print("employee no."+empid+"\t\t"+"employee name"+"\t\t"+empname+"\t\t"+"account no."+acc);
System.out.println("-------------------------------------------------------------------------------");
System.out.println("\t\t"+"Rupees"+"\t\t"+"Rupess");
System.out.println("-------------------------------------------------------------------------------");
System.out.println("basic"+"\t\t"+basic+"\t\t"+"pf"+"\t\t"+pf);
System.out.println("da"+"\t\t"+da+"\t\t"+"ptax"+"\t\t"+ptax);
System.out.println("hra"+"\t\t"+hra+"\t\t"+"ESI"+"\t\t"+esi);
System.out.println("ma"+"\t\t"+ma+"\t\t"+"loan"+"\t\t"+loan);
System.out.println("other allowance"+"\t\t"+otherall+"\t\t"+"other deduction"+"\t\t"+otherded);
System.out.println("gross pay"+"\t\t"+gross+"\t\t"+"total deduction"+ded);
System.out.println("net pay"+"\t\t"+netpay);    
}
}




