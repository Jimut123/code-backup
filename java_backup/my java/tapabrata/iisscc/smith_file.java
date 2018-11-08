package iisscc;
import iisscc.smith.smith_chk;
import java.io.*;
import java.util.*;
class smith_file
{
public static void main()throws IOException
{
PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("numfile.dat")));
Scanner ob=new Scanner(System.in);
String s="";
int n=0,ch=0;
do
{
System.out.println("input number :");
n=ob.nextInt();
pw.println(n);
System.out.println("want to give more entries ? (yes=1/no=0) :");
ch=ob.nextInt();
}while(ch==1);
pw.close();
s="";
iisscc.smith.smith_chk c=new iisscc.smith.smith_chk();
pw=new PrintWriter(new BufferedWriter(new FileWriter("smithfile.dat")));
BufferedReader br=new BufferedReader(new FileReader("numfile.dat"));
while((s=br.readLine())!=null)
{
n=Integer.parseInt(s);
if(c.check(n)==1)
pw.println(n);
}
br.close();
pw.close();
s="";
br=new BufferedReader(new FileReader("numfile.dat"));
System.out.println(" Output of Original File :");
while((s=br.readLine())!=null)
System.out.println(s);
br.close();
s="";
br=new BufferedReader(new FileReader("smithfile.dat"));
System.out.println(" Output of Smith File :");
while((s=br.readLine())!=null)
System.out.println(s);
br.close();
}
}

