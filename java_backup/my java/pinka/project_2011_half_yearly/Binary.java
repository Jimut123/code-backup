package project_2011_half_yearly;
import java.io.*;
class Binary
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int x[]=new int[10];
int i,j,tmp,f,n,v,l,u,mid;
Binary(int n1)throws IOException
{
n=n1;
for(i=0;i<n;i++)
{
System.out.println("Enter number");
x[i]=Integer.parseInt(br.readLine());
//System.out.println(x[i]);
}
original();
arrangement();
sorted();
search();
}
void original()
{
System.out.println("Original arrangment"+n);
for(i=0;i<n;i++)
{
//System.out.println("Original arrangment1");
System.out.println(x[i]);
}
}
void arrangement()
{
for(i=0;i<n;i++)
{
for(j=0;j<n-i-1;j++)
if(x[j]>x[j+1])
{
tmp=x[j];
x[j]=x[j+1];
x[j+1]=tmp;
}
}
}
void sorted()
{
System.out.println("Sorted arrangement");
for(i=0;i<n;i++)
{
System.out.println(x[i]);
}
}
void search()throws IOException
{
System.out.println("Give element");
v=Integer.parseInt(br.readLine());
f=0;
l=0;
u=n-1;
mid=(l+u)/2;
while(l<=u)
{
if(x[mid]==v)
{
f=1;
break;
}
else
if(v>x[mid])
l=mid+1;
else
if(v<x[mid])
l=mid-1;
mid=(l+u)/2;
}
if(f==1)
{
System.out.println("Element found");
}
else
{
System.out.println("Element not found");
}
}
}

