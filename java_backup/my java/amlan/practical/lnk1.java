package practical;

//EXAMPLE OF LINKED LIST(INSERT AND DISPLAY
import java.io.*;
class lnk1
{
public static void main(String args[])throws IOException
{
String y;
y="YES";
lnk s=new lnk();
lnk s1=new lnk();
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
}
}
