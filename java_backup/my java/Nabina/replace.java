import java.io.*;
class replace
{
public static void main(String args[])throws IOException
{
int i,j,p,m;
String s1,w="",w1="",w2="";
char ch;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter text 1:");
s1=input.readLine();
System.out.println("Enter char:");
w1=input.readLine();
p=0;
for(i=0;i<s1.length();i++)
{
ch=s1.charAt(i);
p++;
if(ch==' ')
{
p=0;
}
if(p==2)
w=w+w1;
else
w=w+ch;
}
System.out.println(w);
}
}