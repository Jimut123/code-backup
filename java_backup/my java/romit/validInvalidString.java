import java.io.*;
class validInvalidString
{
public static void main(String args[])throws IOException
{
BufferedReader Input=new BufferedReader(new InputStreamReader(System.in));
int i,f=0,p;
String n;
char h;
System.out.println("Enter The String");
n=Input.readLine();
f=0;
for(i=0;i<n.length();i++)
{
if(n.charAt(i)=='(')
{
p=i+1;
f=0;
while(n.charAt(p)!=')')
{
if(n.charAt(p)=='(')
{
f=1;
//System.out.println(f);
break;
}

p++;
}
if(f==1)
break;
}
}
if(f==0)
{
System.out.println("Valid String");
}
else
{
System.out.println("Invalid String");
}
}
}
