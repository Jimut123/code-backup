
import java.io.*;
class vowelchange
{
public static void main(String[]args)throws IOException
{
int i,d,k;
String s,w;
InputStreamReader aa=new InputStreamReader(System.in);
BufferedReader bb=new BufferedReader(aa);
System.out.print("input string words=");
s=bb.readLine();
d=s.length();
k=0;
w="";
for(i=0;i<d;i++)
{
if(s.charAt(i)=='a')
{
k=(int)s.charAt(i);
w=w+(char)(k+1);
}
else if(s.charAt(i)=='e')
{
k=(int)s.charAt(i);
w=w+(char)(k+1);
}
else if(s.charAt(i)=='i')
{
k=(int)s.charAt(i);
w=w+(char)(k+1);
}
else if(s.charAt(i)=='o')
{
k=(int)s.charAt(i);
w=w+(char)(k+1);
}
else if(s.charAt(i)=='u')
{
k=(int)s.charAt(i);
w=w+(char)(k+1);
}
}
System.out.println(w);
}
}
