import java.io.*;
class slectsort
{
int i,j,m,n,t;
int a[]=new int[100];
InputStreamReader aa=new InputStreamReader(System.in);
BufferedReader ll=new BufferedReader(aa);
public void intake()throws IOException
{
n=15;
a=new int[n];
for(i=0;i<n;i++)
{
System.out.print("input number=");
a[i]=Integer.parseInt(ll.readLine());
}
}
public void calculate()
{
m=0;
{
for(i=0;i<n;i++)
{
if(a[i]=m)
{
break;
}
else
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
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
}
}
}
}
}