import java.io.*;
import java.lang.*;
class prime
{
public static void main(String args[])throws IOException
{
BufferedReader Input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("ENTER THE NUMBER");
int n=Integer.parseInt(Input.readLine());
int i,j,f=0;
for(i=2;i<n;i++)
{
j=n%i;
if(j!=0)
{
f=1;
}
}
if(f==0)
{
System.out.println("The number is prime"+n);
}
if(f==1)
{
System.out.println("the number is not prime"+n);
}
}
}


