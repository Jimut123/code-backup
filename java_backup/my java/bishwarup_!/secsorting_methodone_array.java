import java.io.*;
class secsorting_methodone_array
{
public static void main(String args[])throws IOException
{
int a[]=new int [50];
int i=0,j=0,t,n;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Give Term:");
n=Integer.parseInt(br.readLine());
for(i=0;i<n;i++)
a[i]=Integer.parseInt(br.readLine());
for(i=0;i<n-1;i++)
{
for(j=1+i;j<n;j++)
if(a[i]>a[j])
{
t=a[i];
a[i]=a[j];
a[j]=t;
}
}
for(i=0;i<n;i++)
System.out.println(a[i]);
}
}