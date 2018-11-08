
import java.io.*;
class mergesort
{
int i,j,m,n,t;
int a[]=new int[100];
int b[]=new int[100];
int c[]=new int[100];
InputStreamReader aa=new InputStreamReader(System.in);
BufferedReader ll=new BufferedReader(aa);
public void intake()throws IOException
{
System.out.print("the range=");
n=Integer.parseInt(ll.readLine());
a=new int[n];
b=new int[n];
for(i=0;i<n;i++)
{
System.out.print("\n input 1st array number=");
a[i]=Integer.parseInt(ll.readLine());
System.out.print("\n input 2nd array number=");
b[i]=Integer.parseInt(ll.readLine());
}
}
public void calculate()
{
for(i=0;i<n-1;i++)
{
for(j=i+1;j<n;j++)
{
if(a[i]>a[j])
{
t=a[i];
a[i]=a[j];
a[j]=t;
}
}
}
for(i=0;i<n-1;i++)
{
for(j=i+1;j<n;j++)
{
if(b[i]>b[j])
m=b[i];
b[i]=b[j];
b[j]=m;
}
}

}
public void display()
{
for(i=0;i<(n+n);i++)
{
System.out.println(c[i]);
}
}
}