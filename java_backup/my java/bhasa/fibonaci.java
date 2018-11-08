import java.io.*;
class fibonaci
{
public static void main (String args[])throws IOException
{
int n,i,a,b,c;

BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println ("Enter term:");
n=Integer.parseInt(br.readLine());
a=0;
b=1;
System.out.print(a+","+b);
for (i=1;i<=n-2;i=i+1)
{
c=a+b;
System.out.print (","+c);
a=b;
b=c;
}
}
}