import java.io.*;
class electricitybill
{
String name=" ";
String C_no=" ";
double units=0;
void input()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("||Enter your name||-->");
name=br.readLine();
System.out.println("||Enter your consumer number||-->");
C_no=br.readLine();
System.out.println("||Enter Units consumed||-->");
units=Integer.parseInt(br.readLine());
}
void output()
{
System.out.print("NAME-->"+name);
System.out.print("CONSUMER NUMBER-->"+C_no);
System.out.print("UNITS CONSUMED-->"+units);
double electricity=0;
if(units<=100)
{
electricity=(80*units)/100;
}
if((units>100)&&(units<200))
{
electricity=(.80*100)+(units-100)*1;
}
if(units<=200)
{
electricity=(.80*100)+100*1+(units-200)*1.25;
}
System.out.print("CHARGES ARE:"+electricity);
}
}


