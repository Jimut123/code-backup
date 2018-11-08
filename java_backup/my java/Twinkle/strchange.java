import java.io.*;
class strchange
{
public static void main(String args[])throws IOException
{
String s,w,b,s1,s2;
int i;
w=b=s1=s2="";
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Give String:");
s=br.readLine();
System.out.println("Give searching String:");
s1=br.readLine();
System.out.println("Give desired String:");
s2=br.readLine();
for(i=0;i<s.length();i++)
{
if(s.charAt(i)==' '||s.charAt(i)==','||s.charAt(i)=='.')
{
if(w.compareTo(s1)==0)
b=b+s2+" ";
else
b=b+w+" ";
w="";
}
else
w=w+s.charAt(i);
}
if(w.compareTo(s1)==0)
b=b+s2+" ";
else
b=b+w+" ";
System.out.println(b);
}
}