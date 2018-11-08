import java.io.*;
class x
{
public static void main()throws IOException 
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s,w;
w="";
int i;
System.out.println("give string");
s=br.readLine();
for(i=0;i<s.length();i++)
{
if(s.charAt(i)==' ')
{
System.out.print(w.charAt(0));
System.out.print('.');
w="";
}
else
w=w+s.charAt(i);

}
System.out.print(w);
}
}
