import java.io.*;
class secondstring
{
public static void main() throws IOException
{
String S;
int i,c;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println("Enter a string");
S=br.readLine();
c=0;
for (i=0;i<=S.length()-1;i++)
{
If(S.charAt(i)==S.chart(i+1));
{
c++;
}
}
System.out.println(c);
}
}
