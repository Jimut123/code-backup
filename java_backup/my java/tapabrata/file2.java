import java.io.*;
public class file2
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new FileReader("name.txt"));
String name="";
while((name=br.readLine())!=null)
System.out.println(name);
br.close();
}
}
