package practical;

import java.io.*;
class lno
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a[]=new int[100];
int i,j,t,n,k,k1,j1;
System.out.println("Give Terms:");
n=Integer.parseInt(br.readLine());
t=0;
for(i=1;i<=n;i++)
{
a[t]=i;
t++;
}
k=1;
for(i=1;i<=n;i++)
{
k1=0;
t=0;
for(j=0;j<n;j++)
{
if(k1<k)
{
//System.out.println("i"+i);
//System.out.println(k1);
//System.out.println(k);
a[t]=a[j];
t++;
k1=k1+1;
}
else
{
k1=0;
}
}
n=t;
for(j1=0;j1<n;j1++)
System.out.print(a[j1]+" ");
System.out.println("");
k++;
}
}
}