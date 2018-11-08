 

import java.io.*;
import java.util.*;
class employee
{
Scanner sc=new Scanner(System.in);
String name="",des="";
long id=0;
double basic=0.0,gross=0.0;
void mainfunc()throws IOException
{
System.out.println("give the employee name : ");
name=sc.nextLine();
System.out.println("give the employee designation : ");
des=sc.nextLine();
System.out.println("give the employee id : ");
id=sc.nextLong();
System.out.println("give the employee basic : \nRs. ");
basic=sc.nextDouble();
class add
{
double da=0.0,hra=0.0,add=0.0;
void calc1()throws IOException
{
PrintWriter pw2=new PrintWriter(new BufferedWriter(new FileWriter("addition.mp3")));
da=basic*0.11;
pw2.println(da);
hra=basic*0.5;
pw2.println(hra);
add=da+hra;
pw2.println(add);
pw2.close();
}
}
add ad=new add();
class deduct
{
double it=0.0,pf=0.0,deduce=0.0;
void calc2()throws IOException
{
PrintWriter pw3=new PrintWriter(new BufferedWriter(new FileWriter("deduction.mp3")));
it=basic*0.10;
pw3.println(it);
pf=basic*0.7;
pw3.println(pf);
deduce=it+pf;
pw3.println(deduce);
pw3.close();
}
}
deduct d=new deduct();
ad.calc1();
d.calc2();
gross=basic+ad.add-d.deduce;
file();
}
void file()throws IOException
{
BufferedReader ob2=new BufferedReader(new FileReader("addition.mp3"));
BufferedReader ob3=new BufferedReader(new FileReader("deduction.mp3"));
PrintWriter pw1=new PrintWriter(new BufferedWriter(new FileWriter("emp_mastr.mp3")));
pw1.println(name);
pw1.println(des);
pw1.println(id);
pw1.println(basic);
String s="";
while((s=ob2.readLine())!=null)
pw1.println(s);
s="";
while((s=ob3.readLine())!=null)
pw1.println(s);
pw1.println(gross);
pw1.close();
ob3.close();
ob2.close();
s="";
BufferedReader ob1=new BufferedReader(new FileReader("emp_mastr.mp3"));
while((s=ob1.readLine())!=null)
System.out.println(s);
ob1.close();
}
}
