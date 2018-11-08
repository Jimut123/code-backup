import java.io.*;
public class file1
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("name.txt")));
String name="";
int ans=1;
do
{
System.out.println("enter the name");
name=br.readLine();
pw.println(name);
System.out.println("enter more? (1/0)");
ans=Integer.parseInt(br.readLine());
}while(ans==1);
pw.close();
}
}
