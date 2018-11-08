import java.io.*;
public class st2
{
public static void main(String[]args)throws IOException
{
DataInputStream in=new DataInputStream(System.in);
String s;
int a,b,c,d=1;
System.out.println("ENTER WORD");
s=in.readLine();
a=s.length();
for(b=0;b<a;b=b+1)
{
System.out.println();
for(c=0;c<d;c=c+1)
{
System.out.print(s.charAt(c));
}d++;
}}}

