import java.io.*;
class pow
{
public static void main(String args[])throws IOException
{
int n,p=1;
double g,f,s=0;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter ending no.:");
n=Integer.parseInt(input.readLine());
while(p<=n)
{
g=Math.pow(p,p);
f=Math.pow(g,p);
s=s+f;
p++;
}
System.out.println("Sum: "+s);
}
}