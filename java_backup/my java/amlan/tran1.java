
import java.io.*;
class tran1
{

tran1()
{
String filename="cust_det";
String filename1="trn";
String s2;
boolean EOF=false;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
try
{
FileInputStream fr=new FileInputStream(filename);
DataInputStream de=new DataInputStream(fr);
FileOutputStream fw=new FileOutputStream(filename1);
DataOutputStream dw=new DataOutputStream(fw);
System.out.println("Give Account Number:");
s2=br.readLine();
while(!EOF)
{
try
{
String cname,acno,actype,date,ch;
double bal,d,w;
cname=de.readUTF();
acno=de.readUTF();
actype=de.readUTF();
date=de.readUTF();
bal=de.readDouble();
if(s2.compareTo(acno)==0)
{
System.out.println("Name:"+cname);
System.out.println("Account Number:"+acno);
System.out.println("Account Type:"+actype);
System.out.println("Date:"+date);
System.out.println("Balance:"+bal);
System.out.println("Balance:"+bal);
System.out.println("Deposit/Withdraw");
ch=br.readLine();
if(ch.compareTo("Deposit")==0||ch.compareTo("deposit")==0||ch.compareTo("DEPOSIT")==0||ch.compareTo("D")==0||ch.compareTo("d")==0)
{
d=Double.parseDouble(br.readLine());
bal=bal+d;
}
else
{
 w=Double.parseDouble(br.readLine());
 if(w<bal)
  bal=bal-w;
  }
dw.writeUTF(cname);
dw.writeUTF(acno);
dw.writeUTF(actype);
dw.writeUTF(date);
dw.writeDouble(bal);
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
dw.close();
fw.close();
}
catch(IOException e)
{
System.err.println(e);
}

}
}
