
import java.io.*;
class dispac2
{

dispac2()
{
String filename="cust_det";
String s2;
boolean EOF=false;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
try
{
FileInputStream fr=new FileInputStream(filename);
DataInputStream de=new DataInputStream(fr);
System.out.println("Give Account Type:");
s2=br.readLine();
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
if(s2.compareTo(actype)==0)
{
System.out.println("Name:"+cname);
System.out.println("Account Number:"+acno);
System.out.println("Account Type:"+actype);
System.out.println("Date:"+date);
System.out.println("Balance:"+bal);
}
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
