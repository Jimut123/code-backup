import java.io.*;
import java.lang.*;
class series1 
{
public static void main(String args[])throws IOException
{
BufferedReader Input= new BufferedReader(new InputStreamReader(System.in));
int i,j;
System.out.println("Enter The Value Of n");
int n =Integer.parseInt(Input.readLine()); 
int s=0,m;
int r=0;
int f=1;
int d=1;
int l;
for(i=2;i<=n-1;i++)
{
for(j=3;j<=n;j++)
{
for(m=1;m<=j;m++)
{
f=f*m;
}

s=1/f;

r=r+(s*d);
d=d*(-1);
}
System.out.println(r);
}
}
}