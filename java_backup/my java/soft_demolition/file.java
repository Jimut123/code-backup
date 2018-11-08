//Writing into file
import java.io.*;
class file
{
static String filename="book";
static InputStreamReader isr=new InputStreamReader(System.in);
static BufferedReader br=new BufferedReader(isr);
public static void main(String args[])throws IOException
{
try
{
String bname,bcode,ch;
double price;
FileOutputStream fw=new FileOutputStream(filename);
DataOutputStream dw=new DataOutputStream(fw);
while(true)
{
System.out.println("Give bookname:");
bname=br.readLine();
System.out.println("Give bookcode:");
bcode=br.readLine();
System.out.println("Give price:");
price=Double.parseDouble(br.readLine());
dw.writeUTF(bname);
dw.writeUTF(bcode);
dw.writeDouble(price);
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
