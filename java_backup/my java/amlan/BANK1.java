
import java.io.*;
class bank1
{
public static void main(String args[])throws IOException
{
try
{
String filename="cust_det";
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
String cname,acno,actype,date,ch;
double bal;
FileOutputStream fw=new FileOutputStream(filename);
DataOutputStream dw=new DataOutputStream(fw);
while(true)
{
System.out.println("Give customer name:");
cname=br.readLine();
System.out.println("Give account number:");
acno=br.readLine();
System.out.println("Give account type:");
actype=br.readLine();
System.out.println("Give Initial Deposit:");
bal=Double.parseDouble(br.readLine());
dw.writeUTF(cname);
dw.writeUTF(acno);
dw.writeUTF(actype);
dw.writeDouble(bal);
System.out.println("Want another(Yes/NO):");
ch=br.readLine();
if(ch.compareTo("N")==0 || ch.compareTo("NO")==0 || ch.compareTo("n")==0 ||ch.compareTo("No")==0 ||ch.compareTo("nO")==0)
break;
}

dw.close();
fw.close();
}
catch(IOException e)
{
System.out.println(e);
}
}
}
