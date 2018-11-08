package link.stackQueue;

import java.io.*;
class quepro
{
double price;
String idno,pron,des,datep;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));

void input()throws IOException
{
System.out.println("Enter unique ID no.:");
idno=input.readLine();
System.out.println("Enter product name:");
pron=input.readLine();
System.out.println("Enter description:");
des=input.readLine();
System.out.println("Enter Date of purchase:");
datep=input.readLine();
System.out.println("Enter price:");
price=Double.parseDouble(input.readLine());
}

void disp1()
{
System.out.println("Unique ID no.   Product name    Description    Date of purchase   Price   ");
System.out.println("         "+idno+"          "+pron+"           "+des+"         "+datep+"   "+price);
}

void disp2()
{
System.out.println("   Product name   Price   ");
System.out.println("         "+idno+" "+price);
}
}