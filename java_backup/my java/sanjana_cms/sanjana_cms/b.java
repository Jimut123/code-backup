import java.io.*;
class b
{
public static void main() throws IOException
{
String s,w;
int i,j;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println("Enter String");
s=br.readLine();
w="";
for (i=s.length()-1; i>=0; i--)
{
if (s.charAt(i)==' ')
{
for (j=w.length()-1; j>=0; j--)
System.out.print(w.charAt(j));
System.out.print(" ");
w="";
}
else
w=w+s.charAt(i);
}
for (j=w.length()-1; j>=0; j--)
System.out.print(w.charAt(j));
}
}
