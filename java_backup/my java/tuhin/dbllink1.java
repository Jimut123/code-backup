
//EXAMPLE OF double LINKED LIST(INSERT AND DISPLAY)
import java.io.*;
class dbllink1
{
public static void main(String args[])throws IOException
{
int m,n;
String y;
y="YES";
dbllink s=new dbllink();
dbllink s1=new dbllink();
//dbllink s2=new lnk();
//dbllink s3=new lnk();
//dbllink s4=new lnk();
//dbllink s5=new lnk();
//dbllink s6=new lnk();
s1=s;
int c=0;
s1.next=null;
s1.prev=null;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
while(y.compareTo("YES")==0||y.compareTo("Yes")==0||y.compareTo("YES")==0)
{
s.input();
c++;
System.out.println("Give another");
y=br.readLine();
if(y.compareTo("YES")==0||y.compareTo("Yes")==0||y.compareTo("YES")==0)
{
s.next=new dbllink();
s.next.prev=s;
s=s.next;
}
}
s.next=null;
System.out.println("TOTAL NODES IN THE LIST:"+c);
//s.l=0;
s=s1;
System.out.println("Display the list next-> ");
while(s.next!=null)
{
s.disp();
if(s.next.next==null)
s.next.disp();
s=s.next;
}
System.out.println("Display the list previous-> ");
while(s.prev!=null)
{
s.disp();
if(s.prev.prev==null)
s.prev.disp();
s=s.prev;
}
}
}