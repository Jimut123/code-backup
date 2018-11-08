package testpaper.proj;

import java.io.*;
class merge
{
public static void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
PrintWriter pw1=new PrintWriter(new BufferedWriter(new FileWriter("stud.txt")));
PrintWriter pw2=new PrintWriter(new BufferedWriter(new FileWriter("mrks.txt")));
String w="",ch="";double m;int r;
do
{
System.out.println("give the roll number :");
r=Integer.parseInt(br.readLine());
pw1.println(r);
System.out.println("give the name :");
w=br.readLine();
pw1.println(w);
System.out.println("want to give more names ? (y/n) :");
ch=br.readLine();
}while(ch.equalsIgnoreCase("y")==true);
pw1.close();
do
{
System.out.println("give the roll number :");
r=Integer.parseInt(br.readLine());
pw2.println(r);
System.out.println("give the marks :");
m=Double.parseDouble(br.readLine());
pw2.println(m);
System.out.println("want to give more names ? (y/n) :");
ch=br.readLine();
}while(ch.equalsIgnoreCase("y")==true);
pw2.close();
PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("studmrks.txt")));
BufferedReader ob1=new BufferedReader(new FileReader("stud.txt"));
String s="",s1="",s2="";int r1,r2;
double mrk;
while((s1=ob1.readLine())!=null)
{
s=ob1.readLine();
BufferedReader ob2=new BufferedReader(new FileReader("mrks.txt"));
while((s2=ob2.readLine())!=null)
{
r1=Integer.parseInt(s1);
r2=Integer.parseInt(s2);
mrk=Double.parseDouble(ob2.readLine());
if(r1==r2)
{
pw.println(s);
pw.println(r1);
pw.println(mrk);
}
}
ob2.close();
}
ob1.close();
pw.close();
BufferedReader ob=new BufferedReader(new FileReader("studmrks.txt"));
s="";r=0;
mrk=0.0;
System.out.println("merged file :");
while((s=ob.readLine())!=null)
{
r=Integer.parseInt(ob.readLine());
mrk=Double.parseDouble(ob.readLine());
System.out.println(s);
System.out.println(r);
System.out.println(mrk);
}
ob.close();
}
}
