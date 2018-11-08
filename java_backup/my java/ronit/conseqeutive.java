import java.io.*;
class conseqeutive
{
public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
int n,k=0,j,s,f,i;
System.out.println("ENTER A NO:");
n=Integer.parseInt(br.readLine());
for(i=1;i<n;i++)
{
 s=0;f=0;
for(j=i;j<=n;j++)
{
s=s+j;
if(s>n)
{
f=1;
break;
}
else if(s==n)
{
f=0;
break;
}
}
if(f==0)
{
for(k=i;k<=j;k++)
{
System.out.print(k);
System.out.print("+");
}
System.out.println(" ");
}
}
}
}
