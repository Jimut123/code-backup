import java.io.*;
class pascal
{
public static void main(String args[])throws IOException
{
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
int n,f=1;
System.out.println("Enter number:");
n=Integer.parseInt(input.readLine());
for(int i=1;i<=n;i++)
{
System.out.println(f+"");
f=f*11;
}
}
}
