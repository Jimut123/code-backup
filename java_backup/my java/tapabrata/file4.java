import java.io.*;
public class file4
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new FileReader("stud.dat"));
String name="";
int rno=0;
while((name=br.readLine())!=null)
{
rno=Integer.parseInt(br.readLine());

System.out.println(rno);
System.out.println(name);

}
br.close();
}
}
