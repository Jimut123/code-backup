import java.io.*;
class loop
{
public static void main()throws IOException 
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s;
int i;
System.out.println("give string");
s=br.readLine();
for(i=s.length()-1;i>=0;i--)
System.out.println(i);
}
}
