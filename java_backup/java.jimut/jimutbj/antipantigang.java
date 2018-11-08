import java .io.*;
public class antipantigang
{
public static void main(String args[])throws IOException
{
int n1,n,s,k;
s = 0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter number:");
n=Integer.parseInt(br.readLine());
n1 = n;

while(n>0)
{
k = n % 10;
s = s + (k*k*k);
n = n / 10;
}
if(s == n1)
System.out.println("armgstrom"+n1);
else
System.out.println("it is not a amgstrom number"+n1);
}
}