import java.io.*;
class numc
{
public static void main(String args[])throws IOException
{
int n,i,j,k;
int s=0;
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
System.out.println("Enter number:");
n=Integer.parseInt(input.readLine());
System.out.println("The coms are:");
for(i=1;i<=n/2;i++)
{
s=0;
for(j=i;j<=n;j++)
{
s=s+j;
if(s==n)
{
for(k=i;k<=j;k++)
System.out.print(k+",");
System.out.println(" ");
}
if(s>n)
break;
}
}
}
}


