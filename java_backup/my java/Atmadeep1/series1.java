import java.io.*;
import java.lang.*;
class series1
{
public static void main(String args[])throws IOException
{
int n;
double s,p,k,f=1,i,j,t;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter no.:");
n=Integer.parseInt(input.readLine());
s=0;p=0;
k=1;
t=1;
for(i=1;i<=n;i++)
{
f=1;
for(j=1;j<=t;j++)
{
f=f*j;
}
p=t/f;
//System.out.println(p);
s=s+(p*k);
k=k*-1;
t=t+2;
}
System.out.println("Sum of series:"+s);
}
}



