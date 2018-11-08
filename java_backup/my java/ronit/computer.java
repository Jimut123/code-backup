import java.io.*;
class computer
{
public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
int i,j,k,l;
String s;
System.out.println("Enter The String");
s=br.readLine();
 l=s.length();
for(i=l-1;i>=0;i--)

{
for(j=i;j>=0;j--)
{
System.out.print(s.charAt(j));
}
System.out.println("  ");
}
}
}





