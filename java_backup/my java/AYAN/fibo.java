import java.io.*;
class fibonacci
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a=0,b=1,s=0,n=0;
System.out.println("Enter any number:");
n=Integer.parseInt(br.readLine());
System.out.println("The fibonacci series is:");
System.out.println(a);
System.out.println(b);
while(s<=n)
{
s=a+b;
a=b;
b=s;
System.out.println(s);
}
}
}
