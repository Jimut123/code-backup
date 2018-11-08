import java.io.*;
class tribonaccie
{
public static void main(String args[])throws IOException
{
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
int n,i,a,b,c,d=0;
System.out.println("Enter the 1st number");
n=Integer.parseInt(input.readLine());
a=0;
b=1;
c=2;
System.out.print(a+ "," +b +"," +c +",");
for(i=1;i<=n-3;i++)
{
d=a+b+c;
System.out.print(d+",");
a=b;
b=c;
c=d;
}
}
}
