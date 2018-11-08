import java.io.*;
class armstrongs
{
int Armstrong(int n)
{
int d,s=0,p=n;
while(n!=0)
{
d = n % 10 ;
s = s + d * d * d;
n = n / 10 ;
}
if (p==s)
{
return(0);
}
}
public static void main (String args[])throws IOException
{
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader(ab);
int e;
System.out.println("ENTER ANY NO.::");
e = Integer.parseInt(cd.readLine());
int x = ob.Armstrong(e);
if(x==1)
{
System.out.println("ARMSTRONG");
}
else
{
System.out.println("NOT ARMSTRONG");
}
}
}