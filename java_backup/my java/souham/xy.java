import java.io.*;
class xy
{
public static void main()throws IOException 
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s;
int i;
System.out.println("give string");
s=br.readLine();
for(i=0;i<s.length();i++)
{
System.out.print(s.charAt(i));
if(s.charAt(i)==' ')
System.out.println("");
}
}
}