package testpaper.proj;

import java.io.*;
class bank
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
double ib,rb,d,w;
class customer
{
String nm,ad,acc;
long acn;
void inpt()throws IOException
{
System.out.println("\nDEAR CUSTOMER, PLEASE FILL THE FOLLOWING FIELDS ::::::");
System.out.println("Give the customer name :::");
nm=br.readLine();
System.out.println("Give the customer address :::");
ad=br.readLine();
System.out.println("Give the customer account type :::");
acc=br.readLine();
System.out.println("Give the customer account number :::");
acn=Long.parseLong(br.readLine());
}
void disp()
{
System.out.println("\ncustomer name :::\n"+nm);
System.out.println("customer address :::\n"+ad);
System.out.println("customer account type :::\n"+acc);
System.out.println("customer account number :::\n"+acn);
}
}
customer c=new customer ();
void input()throws IOException
{
c.inpt();
System.out.println("Give the customer's initial balance :::");
ib=rb=Double.parseDouble(br.readLine());
}
void deposit()throws IOException
{
System.out.println("Give the deposit amount :::");
d=Double.parseDouble(br.readLine());
rb=rb+d;
}
void withdraw()throws IOException
{
System.out.println("Give the withdraw amount :::");
w=Double.parseDouble(br.readLine());
rb=rb-w;
}
void details()
{
c.disp();
System.out.println("customer's initial balance :::\nRs. "+ib);
System.out.println("customer's remaining balance :::\nRs. "+rb);
}
}
