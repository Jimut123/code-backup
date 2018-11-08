import java.io.*;
class binary_searching
{
public static void main (String args[])throws IOException
{
int n,h,l,m,v,f,i,t,j;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.print("Enter no. of array elements");
n=Integer.parseInt(br.readLine());
int a[]=new int [n];
for(i=0;i<n;i++)
{
a[i]=Integer.parseInt(br.readLine());
}
for (i=0;i<n;i++)
{
for (j=0;j<n-i-1;j++)
{
if (a[j]>a[j+1])
{
t=a[j];
a[j]=a[j+1];
a[j+1]=a[j];
}
}
}
h=n-1;
l=0;
m=(h+l)/2;
f=0;
System.out.print("Enter search element");
v=Integer.parseInt(br.readLine());

while (l<=h)
{
if (a[m]==v)
{
f=1;
break;
}
else
if(v>a[m])
{
l=m+1;
}
if (v<a[m])
{
h=m-1;
}
m=(h+l)/2;
}
if(f==1)
System.out.println("Element found...."+v);
else
System.out.println("Element not found...."+v);
}
}
