import java.io.*;
class xyz
{
public static void main()throws IOException 
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String b,m,s,w;
int i,j;
System.out.println("give string");
s=br.readLine();
w="";
for(i=0;i<s.length();i++)
{
if(s.charAt(i)==' ')
{
for(j=w.length()-1;j>=0;j--)
System.out.print(w.charAt(j));
System.out.print(" ");
w="";
}
else
w=w+s.charAt(i);
}
for(j=w.length()-1;j>=0;j--)
System.out.print(w.charAt(j));
}
}
