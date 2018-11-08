package project_xii;


import java.io.*;
class link4
{
public static void main(String args[])throws IOException
{
int m,n;
String y;
y="YES";
lnk s=new lnk();
lnk s1=new lnk();
//lnk s2=new lnk();
//lnk s3=new lnk();
//lnk s4=new lnk();
//lnk s5=new lnk();
//lnk s6=new lnk();
s1=s;
int c=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
while(y.compareTo("YES")==0||y.compareTo("Yes")==0||y.compareTo("YES")==0)
{
s.input();
c++;
System.out.println("Give another");
y=br.readLine();
if(y.compareTo("YES")==0||y.compareTo("Yes")==0||y.compareTo("yes")==0)
{
s.l=new lnk();
s=s.l;
}
}
s.l=null;
System.out.println("TOTAL NODES IN THE LIST:"+c);
//s.l=0;
int i=1;
s=s1;
System.out.println("Display the list");
while(s!=null)
{
s.disp();
s=s.l;
//i++;
}
}
}