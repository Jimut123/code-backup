import java.io.*;
class evenodd_minmax_swapposition
{
public static void main(String args[])throws IOException
{
int a[]=new int [100];
int i,max,min,n,pos,pos1;
pos=pos1=0;
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
System.out.println("Give nos of element:");
n=Integer.parseInt(br.readLine());
for(i=0;i<n;i++)
{
System.out.println("Give value:");
a[i]=Integer.parseInt(br.readLine());
}
for(i=0;i<n;i++)
{
if(a[i]%2==0)
System.out.println("EVEN:::"+a[i]);
else
System.out.println("ODD:::"+a[i]);
}
max=min=a[0];
for(i=0;i<n;i++)
{
if(a[i]>max)
{
pos=i;
max=a[i];
}
else
if(a[i]<min)
{
pos1=i;
min=a[i];
}
}
int t;
t=a[pos];
a[pos]=a[pos1];
a[pos1]=t;
System.out.println("maximum"+max);
System.out.println("minium"+min);
System.out.println("swaped value"+a[pos]+","+a[pos1]);
}
}
