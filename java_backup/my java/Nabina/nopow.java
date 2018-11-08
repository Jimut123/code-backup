import java.io.*;
class nopow
{
public static void main(String args[])throws IOException
{
int n,x,i,p=1,s=0;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter no:");
x=Integer.parseInt(input.readLine());
System.out.println("Enter power of no:");
n=Integer.parseInt(input.readLine());
n=n-1;
while(n>=0)
{
p=1;
for(i=1;i<=n;i++)
{
p=p*x;
}
s=s+p;
n=n-1;
}
System.out.println("Sum: "+s);
}
}