import java.io.*;
class nolibpow
{
public static void main(String args[])throws IOException
{
int n,x,i,j;
long s=0,p=1;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter no.:");
x=Integer.parseInt(input.readLine());
System.out.println("Enter no.:");
n=Integer.parseInt(input.readLine());
n=n-1;
while(n>=0)
{
for(i=1;i<=n;i++)
{
p=p*x;
}
s=s+p;
n=n-1;
}
}
}