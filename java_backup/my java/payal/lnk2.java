
//EXAMPLE OF LINKED LIST(INSERT AND DISPLAY,insert
import java.io.*;
class lnk2
{
public static void main(String args[])throws IOException
{
int m,n;
String y;
y="YES";
lnk s=new lnk();
lnk s1=new lnk();
lnk s2=new lnk();
lnk s3=new lnk();
lnk s4=new lnk();
lnk s5=new lnk();
lnk s6=new lnk();
s1=s;
int c=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
while(y.compareTo("YES")==0||y.compareTo("Yes")==0||y.compareTo("YES")==0)
{
s.input();
c++;
System.out.println("Give another");
y=br.readLine();
if(y.compareTo("YES")==0||y.compareTo("Yes")==0||y.compareTo("YES")==0)
{
s.l=new lnk();
s=s.l;
}
}
System.out.println("TOTAL NODES IN THE LIST:"+c);
//s.l=0;
int i=1;
s=s1;
System.out.println("Display the list");
while(i<=c)
{
s.disp();
s=s.l;
i++;
}
//insertion at begin
s3.input();
s3.l=s1;
s1=s3;
s=s1;
i=1;
c++;
System.out.println("Display the list after insertion at begin");
while(i<=c)
{
s.disp();
s=s.l;
i++;
}

//insertion at end
s4.input();
s=s1;
i=1;
while(i<c)
{
s=s.l;
i++;
}
s.l=s4;
c++;

s1.disp();
s=s1;
i=1;
//c++;
System.out.println("Display the list after insertion at end");
while(i<=c)
{
s.disp();
s=s.l;
i++;
}
//insertion at desired position
System.out.println("Enter position:");
n=Integer.parseInt(br.readLine());
s5.input();
s=s1;
i=1;
while(i<n)
{
s=s.l;
i++;
}
s6=s.l;
s5.l=s6;
s.l=s5;
c++;
s1.disp();
s=s1;
i=1;
//c++;
System.out.println("Display the list after insertion at desired position");
while(i<=c)
{
s.disp();
s=s.l;
i++;
}
}
}
