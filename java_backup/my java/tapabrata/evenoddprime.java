

import java.io.*;
class evenoddprime
{
public static void main(int n)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a[]=new int [n];
int i,j,t=0,k=0,f;
System.out.println("give elements ");
for(i=0;i<n;i++)
a[i]=Integer.parseInt(br.readLine());
System.out.println("array:");
for(i=0;i<n;i++)
System.out.print(a[i]+", ");
System.out.println("");
for(i=0;i<n;i++)
if(a[i]%2==0)
{
k=a[i];
a[i]=a[t];
a[t]=k;
t++;
}
for(i=0;i<n;i++)
if(a[i]%2!=0)
{
f=0;
for(j=2;j<a[i];j++)
if(a[i]%j==0)
{
f=1;
break;
}
if(f==1)
{
k=a[i];
a[i]=a[t];
a[t]=k;
t++;
}
}
for(i=0;i<n;i++)
{
f=0;
for(j=2;j<a[i];j++)
if(a[i]%j==0)
{
f=1;
break;
}
if(f==0)
{
k=a[i];
a[i]=a[t];
a[t]=k;
t++;
}
}
System.out.println("final array");
for(i=0;i<n;i++)
System.out.print(a[i]+", ");
}
}
