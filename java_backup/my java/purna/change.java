
import java.io.*;
class change
{
public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
int l,i;
String w="";
String s;
char c;
System.out.println("enter");
s=br.readLine();
l=s.length();
for(i=0;i<l;i++)
{
c=s.charAt(i);
if(c==' ')
{
//System.out.println(w);
if(w.equalsIgnoreCase("January")==true)
{
System.out.print("August"+" ");
}
else
if(w.equalsIgnoreCase("Republic")==true)
{
System.out.print(" "+"Independence"+" ");
}
else
if(w.equalsIgnoreCase("26")==true)
{
System.out.print(" "+"15"+" ");
}
else
System.out.print(w+" ");
w="";
}
else
{
w=w+c;
}
}
if(w.equalsIgnoreCase("January")==true)
{
System.out.print(" "+"August"+" ");
}
else
if(w.equalsIgnoreCase("Republic")==true)
{
System.out.print(" "+"Independence"+" ");
}
else
if(w.equalsIgnoreCase("26")==true)
{
System.out.print("15"+" ");
}
else
System.out.print(w+" ");
w="";
}
//System.out.println(s);

}





