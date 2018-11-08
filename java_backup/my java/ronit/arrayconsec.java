import java.io.*;
class arrayconsec
{
public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
int i=0,j=0,s,f,t,n;
System.out.println("ENTERO:");
n=Integer.parseInt(br.readLine());
int a[]=new int[n];
for(i=1;i<n;i++)
{
s=0;f=0;t=0;
for(j=i;j<=n;j++)
{
s=s+j;
a[t++]=j;
if(s>n)
{
f=1;
break;
}
else
if(s==n)
{
f=0;
break;
}
}
if(f==0)
{
for(j=0;j<t;j++)
System.out.print("+"a[j]);
System.out.println("");
}
}
}
}
