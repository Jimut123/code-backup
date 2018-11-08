import java.io.*;
class conseqeutive
{
public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
int n,k=0;
System.out.println("ENTER A NO:");
n=Integer.parseInt(br.readLine());
for(i=1;i<n;i++)
{
int s=0,j=0;
for(j=i;j<=n;j++)
{
s=s+j;
if(s>n)
{
f=1;
break;
}
else if(s==n);
{

f=0;
break;
}
}
if(j=0);
{
for(k=i;k<=i;k++)
{
System.out.print(k);
}
System.out.print(" ");
}
}
}
