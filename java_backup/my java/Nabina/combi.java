import java.io.*;
class combi
{
public static void main(String args[])throws IOException
{
int i,j,f=0,s=0,n,k=0,x,h=0,t=0;
int a[]=new int[100];
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter no.:");
n=Integer.parseInt(input.readLine());
for(i=1;i<=n;i++)
{
s=0;
t=0;
for(j=i;j<n;j++)
{
s=s+j;
a[t]=j;
t++;
if(s==n)
{
for(k=0;k<t;k++)
System.out.print(a[k]+" ");
t=0;
s=0;
System.out.println("");
break;
}
else
if(s>n)
{
t=0;
s=0;
break;
}
}
}
}
}


