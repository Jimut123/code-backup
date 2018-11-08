
import java.io.*;
class primetriplet
{
public void main1()throws IOException
{
BufferedReader Input=new BufferedReader(new InputStreamReader(System.in));
int i,k,n,j,m,x,f=0,f1=0,f2,l;
System.out.println("Enter The Upper Boundary");
n=Integer.parseInt(Input.readLine());
System.out.println("Enter The Lower Boundary");
m=Integer.parseInt(Input.readLine());
for(i=n;i<=m;i++)
{
f=prime(i);
if(f==0)
{
for(j=i+1;j<=m;j++)
{
f1=prime(j);
if(f1==0)
{
for(k=j+1;k<=m;k++)
{
f2=prime(k);
if(f2==0)
{
System.out.println(i+","+j+","+k);
break;
}
}
}
}
}
}
}
int prime(int x)
{
int j,f;
f=0;
for(j=2;j<x;j++)
if(x%j==0)
{
f=1;
break;
}
return f;
}
}

