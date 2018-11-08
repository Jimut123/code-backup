import java.io.*;
class program6_____
{
public static void main(String args[])throws IOException
{
int n;
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the numerical string whose alternative product and sum is to be displayed:");
n=Integer.parseInt(in.readLine());
int s1=0;
int n1;
n1=n;
int c=0;
int s=1;
while(n1>0)
{
int k=n1%10;
c++;
if(c%2!=0)
{
s=s*k;
}
else
s1=s1+k;
n1=n1/10;
}
System.out.println("Product"+"="+s);
System.out.println("Sum"+"="+s1);
}
}
