import java.io.*;
class file_merge
{
public static void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
PrintWriter pw1=new PrintWriter(new BufferedWriter(new FileWriter("student.txt")));
PrintWriter pw2=new PrintWriter(new BufferedWriter(new FileWriter("marks.txt")));
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
PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("studentmarks.txt")));
BufferedReader ob1=new BufferedReader(new FileReader("student.txt"));
String s="",s1="",s2="";int r1,r2;
double mark,max=0;
while((s1=ob1.readLine())!=null)
{
s=ob1.readLine();
BufferedReader ob2=new BufferedReader(new FileReader("marks.txt"));
while((s2=ob2.readLine())!=null)
{
r1=Integer.parseInt(s1);
r2=Integer.parseInt(s2);
mark=Double.parseDouble(ob2.readLine());

if(r1==r2)
{
pw.println(s);
pw.println(r1);
pw.println(mark);
if(mark>max)
max=mark;
}
}
ob2.close();
}
ob1.close();
pw.println("Maximum Marks:"+max);
pw.close();
BufferedReader ob=new BufferedReader(new FileReader("studentmarks.txt"));
s="";r=0;
mark=0.0;
System.out.println("merged file :");
while((s=ob.readLine())!=null)
{
System.out.println(s);
//r=Integer.parseInt(s);
//mark=Double.parseDouble(s);
//System.out.println(r);
//System.out.println(mrk);
}
ob.close();
}
}
