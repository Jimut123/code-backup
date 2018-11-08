import java.io.*;
class encryption_2
{
public static void main(String args[])throws IOException
{
String s;
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
int ch,n;
System.out.println("Give String:");
s=br.readLine();
for(int i=0;i<s.length();i++)
{
for(int j=0;j<=i;j++)
System.out.print(s.charAt(j));
System.out.println(" ");
}
}
}