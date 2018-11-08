 


import java.io.*;
class file_pro
{
static String filename="student";
static InputStreamReader isr=new InputStreamReader(System.in);
static BufferedReader br=new BufferedReader(isr);
public static void main(String args[])throws IOException
{
try
{
String filename="student";
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
String sname,scode,ch;
double fees;
FileOutputStream fw=new FileOutputStream(filename);
DataOutputStream dw=new DataOutputStream(fw);
while(true)
{
System.out.println("Give studentname:");
sname=br.readLine();
System.out.println("Give roll:");
scode=br.readLine();
System.out.println("Give fees:");
fees=Double.parseDouble(br.readLine());
dw.writeUTF(sname);
dw.writeUTF(scode);
dw.writeDouble(fees);
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
