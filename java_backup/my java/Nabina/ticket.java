import java.io.*;
class ticketbooth
{
int count=1,count1=1,s=0,f=0;
String s1="yes",s2="no";
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
void main()throws IOException
{
System.out.println("Want to buy ticket?  yes/no");
s=input.readLine();
if(s.comparesTo(s1)==0)
f=1;
if(s.comparesTo(s2)==0)
count++;
}
void ticket1()
{
if(f==1)
count1++;
s=s+100;
}
void disp()
{
System.out.println("No. of visitors:"+(count+count1));
System.out.println("No. of ticket buyers"+count1);
System.out.println("Total amount:"+s);
System.out.println("");
}
}
class ticket
{
public static void main(String args[])throws IOException
{
ticketbooth p=new ticketbooth();
p.visit();
p.ticket1();
p.disp();
}
}


























