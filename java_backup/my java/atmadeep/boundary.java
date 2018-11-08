import java.io.*;
class boundary
{
public static void main(String args[])throws IOException
{

InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
int i,j,n,t=0,temp=0;
System.out.println("Enter array length:");
n=Integer.parseInt(input.readLine());
int a1[][]=new int[n][n];
int a[]=new int[100];
System.out.println("Enter the numbers in array");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
a1[i][j]=Integer.parseInt(input.readLine());
}
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
System.out.print(a1[i][j]+",");
System.out.println("");
}
i=0;
t=0;
for(j=0;j<n;j++)
a[t++]=a1[i][j];
j=n-1;
for(i=1;i<n;i++)
a[t++]=a1[i][j];
i=n-1;
for(j=0;j<n-1;j++)
a[t++]=a1[i][j];
j=0;
for(i=1;i<n-1;i++)
a[t++]=a1[i][j];
for(i=0;i<t;i++)
System.out.println(a[i]);

for(i=0;i<t-1;i++)
for(j=i+1;j<t;j++)
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
for(i=0;i<t;i++)
System.out.println(a[i]);
int k=0;
i=0;
for(j=0;j<n;j++)
a1[i][j]=a[k++];
j=n-1;
for(i=1;i<n;i++)
a1[i][j]=a[k++];
i=n-1;
for(j=0;j<n-1;j++)
a1[i][j]=a[k++];
j=0;
for(i=1;i<n-1;i++)
a1[i][j]=a[k++];
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(i==0||i==n-1)
System.out.print(a1[i][j]+",");
else if(i>0 && i<n)
{
if(j==0||j==n-1)
System.out.print(a1[i][j]+",");
else
System.out.print(" ");
}
}
System.out.println(" ");
}
}
}





