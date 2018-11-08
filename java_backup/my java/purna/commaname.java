
import java.io.*;
class commaname
{
public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
String s,s1="";
int l,i,j;
char c=0;
System.out.println("enter");
s=br.readLine();
l=s.length();
for(i=l-1;i>=0;i--)
{
c=s.charAt(i);
if(c==' ')
{
for(j=s1.length()-1;j>=0;j--)
{
System.out.print(s1.charAt(j));

}
System.out.print(",");
s1="";
}
else
{
s1=s1+c;
}

}
for(j=s1.length()-1;j>=0;j--)
{
System.out.print(s1.charAt(j));
}
//System.out.print(",");
}
}