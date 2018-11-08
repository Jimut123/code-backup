import java . io.*;
import java.lang.*;
class retaw
{
public static void main(String args[])throws IOException
{
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader(ab);
String s,r="";
int i,l,l1,j,k;
char ch;
System.out.println("enter any word");
s = cd.readLine();
l = s.length();
for(k=l;k>0;k--)
{
ch = s.charAt(k);
r = r + ch;
}
l1 = r.length();
for(i=0;i<l1;i++)
{
for(j=0;j<=i;j++)
{
System.out.print(s.charAt(j));
}
System.out.println();
}
}
}

