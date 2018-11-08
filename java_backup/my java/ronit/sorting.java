import java.io.*;
class sorting
{
public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
int n,t=0;
System.out.println("Enter a no:");
n=Integer.parseInt(br.readLine());
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=Integer.parseInt(br.readLine());
}
for(int i=0;i<n-1;i++)
{
for(int j=i+1;j<n;j++)
{
if(a[i]>a[j])
{
t=a[i];
a[i]=a[j];
a[j]=t;
}
}
}

for(int i=0;i<n;i++)
{
System.out.println(a[i]);
}
}
}