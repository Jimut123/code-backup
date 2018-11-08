import java.io.*;
import java.lang.*;
class series 
{
public static void main(String args[])throws IOException
{
BufferedReader Input= new BufferedReader(new InputStreamReader(System.in));
int i=1,j=1;
System.out.println("Enter The Value Of n");
int n =Integer.parseInt(Input.readLine()); 
double s;
double r=0;
int f=1;
int d=1;
int l=1;
for(i=1;i<=n;i++)
{
f=1;
for(j=1;j<=l;j++)
{
f=f*j;
}
s=(double)1/f;
l=l+2;
r=r+(s*d);
d=d*(-1);
}
System.out.println(r);
}
}
