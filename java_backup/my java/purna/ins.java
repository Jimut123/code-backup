
import java.io.*;
class ins
{
public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
String s,w="";
char c;
int l=0,i;
System.out.println("enter name");
s=br.readLine();
l=s.length();
for(i=0;i<l;i++)
{
c=s.charAt(i);
if(c==' ')
{
w=w+" "+"KUMAR"+" ";
}
else
{
w=w+c;
}

}
System.out.print(w);
}
}