import java.io.*;
class security
{
public static void main(String args[])throws IOException
{
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));

int i,p,q,n;
String s;
char ch,h;

System.out.println("Enter code length:");
n=Integer.parseInt(input.readLine());
System.out.println("Enter code:");
s=input.readLine();

p=s.length();
if(p!=n)
{
System.out.println("INVALID");
System.out.println("Code does not match with code-length");
System.exit(0);
}

if(p>6)
{
System.out.println("INVALID");
System.out.println("Code exceeds limit. Maximum code length 6");
System.exit(0);
}

for(i=0;i<s.length();i++)
{
ch=s.charAt(i);
p=(int)ch;
if(p>=97&&p<=123)
{
System.out.println("INVALID");
System.out.println("Code has small letters- capital letters expected");
System.exit(0);
}

if(p>76)
{
System.out.println("INVALID");
System.out.println("Code exceeds limit- alphabets from A-K only allowed");
System.exit(0);
}
if((i+1)<s.length())
{
h=s.charAt((i+1));
q=(int)h;
if((q==(p+1))||(q==p))
{
System.out.println("INVALID");
System.out.println("Alternate letters expected");
System.exit(0);
}
}

}
System.out.println("VALID");

}
}