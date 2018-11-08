import java.io.*;
import java.lang.*;
class shortname
{
public static void main(String args[])throws IOException
{
BufferedReader Input =new BufferedReader(new InputStreamReader(System.in));
String n,h;
int i,j,m;
h="";
m=0;
System.out.println("ENTER THE NAME");
n=Input.readLine();
 h = h+n.charAt(0);
for(i=1;i<n.length();i++)
{
if(n.charAt(i)==' ')
{
h=h+".";
h=h+n.charAt(i+1);
m=i;
}
}
for(j=m+2;j<n.length();j++)
{
h=h+n.charAt(j);
}
System.out.println(h);
}
}


