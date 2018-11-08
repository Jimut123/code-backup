import java.io.*;
class loop
{
public static void main(String args[])throws IOException
{
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
int i,x,n;
double s=0;
System.out.println("Enter the number");
n=Integer.parseInt(input.readLine());
x=Integer.parseInt(input.readLine());
for(i=1;i<=n;i++)
{
s=s+Math.pow(x,(n-i));
}
System.out.println("The series is" +s);
}
}




