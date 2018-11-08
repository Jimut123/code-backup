import java.io.*;
import java.lang.*;
class array1
{
public static void main(String args[])throws IOException
{
int i,j,n,f=0,p,s;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter no.:");
n=Integer.parseInt(input.readLine());
for(i=1;i<=n;i++)
{
for(j=2;j<=i;j++)
{
if(i%j==0)
{
f=1;
break;
}
}
if(f==0)
{
p=(i*i);
System.out.println(p+" ");
s=s+p;
}
}
System.out.println("The sum is:"+s);
}
}
