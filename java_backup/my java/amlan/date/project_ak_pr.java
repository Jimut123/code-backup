package date;

import java.io.*;
class project_ak_pr
{
static String filename="emp.dat";
static InputStreamReader isr=new InputStreamReader(System.in);
static BufferedReader br=new BufferedReader(isr);
public static void main(String args[])throws IOException
{

String dob,doj,ch,name;
double basic;
int yy,yy1;try
{

FileOutputStream fw=new FileOutputStream(filename);
DataOutputStream dw=new DataOutputStream(fw);
while(true)
{
System.out.println("Give Name:");
name=br.readLine();
System.out.println("Give Date of Join:");
doj=br.readLine();
System.out.println("Give Date of Birth:");
dob=br.readLine();
System.out.println("Give Basic Salary");
basic=Double.parseDouble(br.readLine());
yy=Integer.parseInt(doj.substring(5,9));
yy1=Integer.parseInt(dob.substring(5,9));
System.out.println(yy);
System.out.println(yy1);
if((yy-yy1)>=21)
{
dw.writeUTF(name);
dw.writeUTF(doj);
dw.writeUTF(dob);
dw.writeDouble(basic);
}
else
System.out.println("Error Date of Join must greater then Date of Birth");
System.out.println("Want another(Yes/NO):");
ch=br.readLine();
if(ch.compareTo("N")==0 || ch.compareTo("NO")==0 || ch.compareTo("n")==0 ||ch.compareTo("No")==0 ||ch.compareTo("nO")==0)
break;
}

dw.close();
fw.close();
}
catch(IOException e)
{
System.out.println(e);
}
FileInputStream fr=new FileInputStream(filename);
DataInputStream de=new DataInputStream(fr);
Boolean EOF=false;
while(!EOF)
{
try
{
String s,s1;
double d;
name=de.readUTF();
doj=de.readUTF();
dob=de.readUTF();
basic=de.readDouble();
double da=(basic*25)/100;
double hra=(basic*15)/100;
double cca=(basic*10)/100;
double ma=(basic*5)/100;
double it=(basic*10)/100;
double pf=(basic*12)/100;
double pt=(basic*8)/100;
double gross=(basic+da+hra+ma+cca);
double net=gross-(it+pf+pt);
System.out.println("Name of the Employee:"+name);
System.out.println("Date of Join:"+doj);
System.out.println("Date of Birth:"+dob);
System.out.println("Basic Salary:"+basic);
System.out.println("Gross Salary:"+gross);
System.out.println("Net Salary:"+net);
}
catch(EOFException e)
{
System.out.println("End of file.......");
EOF=true;
}
}
}
}