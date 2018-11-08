
import java.io.*;
class file4
{
public static void main(String args[])
{
try
{
String filename=("names.txt");
String s;
FileReader fw=new FileReader(filename);
BufferedReader bw=new BufferedReader(fw);
int i=0;
while((s=bw.readLine())!=null)
{
i++;
System.out.print("Number:"+i+":");
System.out.println(s);
}
bw.close();
}
catch(IOException e)
{
System.err.println(e);
}
}
}