import java.io.*;
class ticketbooth
{
int count=0,count1=0,s3=0,f=0;
String s1="yes",s2="no",s;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
void visit()throws IOException
{
System.out.println("Want to buy ticket?  yes/no");
s=input.readLine();
if(s.compareTo(s1)==0)
f=1;
if(s.compareTo(s2)==0)
count++;
ticket1();
disp();
}
void ticket1()
{
if(f==1)
{
count1++;
s3=s3+100;
}
}
void disp()
{
System.out.println("No. of visitors:"+(count+count1));
System.out.println("No. of ticket buyers"+count1);
System.out.println("Total amount:"+s3);
System.out.println("");
}
}