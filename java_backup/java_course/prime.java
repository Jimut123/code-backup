import java.io.*;
class prime
{
public static void main(String args[])throws IOException
{
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader(ab);
int i,m;
System.out.println("Enter a number:");
m=Integer.parseInt(cd.readLine());
int c=0;
for(i=2;i<m;i++)
{
if(m%i==0)
c=1;
}
if(c==0)
System.out.println("The number is prime.");
else
System.out.println("The number is not prime.");
}
}