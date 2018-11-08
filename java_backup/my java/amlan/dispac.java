
import java.io.*;
class dispac
{

dispac()
{
String filename="cust_det";
boolean EOF=false;
try
{
FileInputStream fr=new FileInputStream(filename);
DataInputStream de=new DataInputStream(fr);
while(!EOF)
{
try
{
String cname,acno,actype,date,ch;
double bal;
cname=de.readUTF();
acno=de.readUTF();
actype=de.readUTF();
date=de.readUTF();
bal=de.readDouble();
System.out.println("Name:"+cname);
System.out.println("Account Number:"+acno);
System.out.println("Account Type:"+actype);
System.out.println("Date:"+date);
System.out.println("Balance:"+bal);
}
catch(EOFException e)
{
System.out.println("End of file.......");
EOF=true;
}
}
de.close();
fr.close();
}
catch(IOException e)
{
System.err.println(e);
}

}
}
