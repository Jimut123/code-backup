import java.io.*;
class country_files
{
   //Writing into file
static String filename="Country";
static InputStreamReader isr=new InputStreamReader(System.in);
static BufferedReader br=new BufferedReader(isr);
public static void main(String args[])throws IOException
{
String s;
int i,n;
FileOutputStream fw=new FileOutputStream(filename);
DataOutputStream dw=new DataOutputStream(fw);
System.out.println("Enter term:");
n=Integer.parseInt(br.readLine());
boolean EOF=false;
for(i=1;i<=n;i++)
{
System.out.println("Give Countryname:");
s=br.readLine();
dw.writeUTF(s);
System.out.println("Give CountryCapital:");
s=br.readLine();
dw.writeUTF(s);
}
dw.close();
fw.close();
FileInputStream fr=new FileInputStream(filename);
DataInputStream de=new DataInputStream(fr);
while(!EOF)
{


    s=de.readUTF();
    System.out.println("Country:"+s);
    s=de.readUTF();
    System.out.println("Capital:"+s);
}
de.close();

}
}
