
import java.io.*;
class wordpalin
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s,w;
int i,j,f,k;
System.out.println("Enter String:");
s=br.readLine();
w="";
s=s+" ";
for(i=0;i<s.length();i++)
{

if(s.charAt(i)==' ')
{
//System.out.println(w);
k=w.length()-1;
f=0;
for(j=0;j<w.length()/2;j++,k--)
{
if(w.charAt(j)!=w.charAt(k))
{
f=1;
break;
}
}
if(f==0)
System.out.println(w);
w="";
}
else
w=w+s.charAt(i);
}
}
}
