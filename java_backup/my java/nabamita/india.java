
import java.io.*;
class india
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s,w,wr;
System.out.println("Enter String:");
s=br.readLine();
int i,j,sp=10;
for(i=0;i<s.length();i++)
{
for(int k=1;k<=sp;k++)
System.out.print(" ");
for(j=i;j>=0;j--)
System.out.print(s.charAt(j));
sp=sp-2;
System.out.println("");
}
}
}
