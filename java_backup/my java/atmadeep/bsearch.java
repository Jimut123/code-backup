import java.io.*;
class bsearch
{
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
int n,v,f;
int ar[]=new int[100];
int i,mid=0,low,high;
void input()throws IOException
{
System.out.println("Enter the no.:");
n=Integer.parseInt(input.readLine());
for(i=0;i<n;i++)
{
ar[i]=Integer.parseInt(input.readLine());
}
sort();
System.out.println("Enter searching element:");
v=Integer.parseInt(input.readLine());
low=0;
high=n-1;
mid=(low+high)/2;
f=0;
search();
if(f==-1)
System.out.println("no searching element:");
else if(f==1)
System.out.println(" searching element found:");
}
void sort()
{
int j,t;
for(i=0;i<n-1;i++)
for(j=i+1;j<n;j++)
if(ar[i]>ar[j])
{
t=ar[i];
ar[i]=ar[j];
ar[j]=t;
}
}
void search()
{
if(low>high)
{
f=-1;
return;
}
else if(v==ar[mid])
{
f=1;
return;
}
else
{
if(v<ar[mid])
{
high=mid-1;
}
else if(v>ar[mid])
{
low=mid+1;
}
mid=(high+low)/2;
search();
}
}
}
