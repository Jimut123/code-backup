package testpaper.proj;

import java.io.*;
class prme_len_file
{
public static void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("gfile.txt")));
String w="",ch="";
do
{
System.out.println("give the name :");
w=br.readLine();
pw.println(w);
System.out.println("want to give more names ? (y/n) :");
ch=br.readLine();
}while(ch.equalsIgnoreCase("y")==true);
pw.close();
pw=new PrintWriter(new BufferedWriter(new FileWriter("prmelenfile.txt")));
BufferedReader ob=new BufferedReader(new FileReader("gfile.txt"));
String s="";
int i,f=0;
System.out.println("Output of File :");
while((s=ob.readLine())!=null)
{
System.out.println(s);
f=0;
for(i=2;i<s.length();i++)
if(s.length()%i==0)
{
f=1;
break;
}
if(f==0)
pw.println(s);
}
ob.close();
pw.close();
ob=new BufferedReader(new FileReader("prmelenfile.txt"));
s="";
System.out.println("Output of File :");
while((s=ob.readLine())!=null)
System.out.println(s);
ob.close();
}
}
