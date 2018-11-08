import java.io.*;
class twos_compliment
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int p,i;
p=0;
System.out.println("ENTER ARRAY SIZE");
String s=br.readLine();
for(i=s.length()-1;i>=0;i--)
{
if(s.charAt(i)=='1')
{
//System.out.print('1');
p=i;
break;
}
}
for(i=0;i<p;i++)
{
if(s.charAt(i)=='1')
{
System.out.print("0");
}
else
System.out.print("1");
}
for(i=p;i<s.length();i++)
{
System.out.print(s.charAt(i));
}
}
}

