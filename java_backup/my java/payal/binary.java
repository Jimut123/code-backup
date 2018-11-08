
import java.io.*;
class binary
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,nn,l,u,i,j,mid,t;
int a[]=new int[100];
int v;
binary(int nn)
{
n=nn;
}
void readdata()throws IOException
{
for(i=0;i<n;i++)
{
a[i]=Integer.parseInt(br.readLine());
}
for(i=0;i<n;i++)
{
for(j=0;j<n-i-1;j++)
{
if(a[j]>a[j+1])
{
t=a[j];
a[j]=a[j+1];
a[j+1]=t;
}
}
}
System.out.print("GIVE THE SEARCHING ELEMENT");
v=Integer.parseInt(br.readLine());
u=n-1;
l=0;
mid=(l+u)/2;
if(binarysearch(v)==-1)
System.out.println("NOT IN THE LIST");
else
System.out.println("IN THE LIST");
}
int binarysearch(int v)
{
if(v==a[mid])
{
return mid;
}
else
if(l>u)
{
return -1;
}
else
{
if(v<a[mid])
{
u=mid-1;
}
else
if(v>a[mid])
{
l=mid+1;
}
mid=(u+l)/2;
return binarysearch(v);
}
}
}