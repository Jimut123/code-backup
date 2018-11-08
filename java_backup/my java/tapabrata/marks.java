import java.io.*;
class marks extends student
{
double m1,m2,m3,sum;
void main()throws IOException
{
PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("info.txt")));
pw.println(n);
pw.println(c);
pw.println(s);
pw.println(ad);
System.out.println("give the marks of subject 1 :");
m1=ob.nextDouble();
pw.println(m1);
System.out.println("give the marks of subject 2 :");
m2=ob.nextDouble();
pw.println(m2);
System.out.println("give the marks of subject 3 :");
m3=ob.nextDouble();
pw.println(m3);
sum=m1+m2+m3;
pw.println(sum);
pw.close();
BufferedReader br=new BufferedReader(new FileReader("info.txt"));
String name="",sec="",add="";
int cl=0;
double mk1,mk2,mk3,sm;
System.out.println("Student's info : ");
while((name=br.readLine())!=null)
{
cl=Integer.parseInt(br.readLine());
sec=br.readLine();
add=br.readLine();
mk1=Double.parseDouble(br.readLine());
mk2=Double.parseDouble(br.readLine());
mk3=Double.parseDouble(br.readLine());
sm=Double.parseDouble(br.readLine());
System.out.println("name : "+name);
System.out.println("class : "+cl);
System.out.println("section : "+sec);
System.out.println("address : "+add);
System.out.println("marks of subject 1 : "+mk1);
System.out.println("marks of subject 2 : "+mk2);
System.out.println("marks of subject 3 : "+mk3);
System.out.println("total marks of 3 subject : "+sm);
}
br.close();
}
}