import java.io.*;
public class file3
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("stud.dat")));
String name="";
int rno=0,ans=1;
do
{
System.out.println("enter the roll number");
rno=Integer.parseInt(br.readLine());
System.out.println("enter the name");
name=br.readLine();

pw.println(name);
pw.println(rno);

System.out.println("enter more? (1/0)");
ans=Integer.parseInt(br.readLine());

}while(ans==1);
pw.close();
}
}
