import java.io.*;
class  secsorting_methodtwo_array
{
public static void main(String args[])throws IOException
{
int a[]=new int [50];
int i=0,j=0,t,n,pos=0;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Give Term:");
n=Integer.parseInt(br.readLine());
for(i=0;i<n;i++)
a[i]=Integer.parseInt(br.readLine());
for(i=0;i<n-1;i++)
{
pos=i;
for(j=i+1;j<n;j++)
if(a[j]<a[pos])
{
pos=j;
}
t=a[i];
a[i]=a[pos];
a[pos]=t;
}
for(i=0;i<n;i++)
System.out.println(a[i]);
}
}