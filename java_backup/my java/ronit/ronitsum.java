import java.io.*;
class ronitsum
{
public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
int n,s=0,k=0;
System.out.println("Enter a no.:");
n=Integer.parseInt(br.readLine());
while(n>0)
{
k=n%10;
s=s+k;
n=n/10;
}
System.out.println(s);
}
}