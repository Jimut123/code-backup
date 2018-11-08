import java.io.*;
class summat
{
public static void main(String args[])throws IOException
{
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
int i,i1,j,n,k;
System.out.println("Enter array length:");
n=Integer.parseInt(input.readLine());
int a[][]=new int[n][n];
int s=0,max=0,min=0;
int temp=0;
System.out.println("Enter the numbers in array");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
a[i][j]=Integer.parseInt(input.readLine());
}
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
s=s+a[i][j];
max=s;
min=s;
}
for(i=0;i<n;i++)
{
s=0;
for(j=0;j<n;j++)
s=s+a[i][j];
if(s>max)
max=s;
else if(s<min)
min=s;
}
int t=0;
for(k=max;k>=min;k--)
{
for(i=0;i<n;i++)
{
s=0;
for(j=0;j<n;j++)
s=s+a[i][j];
if(s==k)
{
i1=i;
for(j=0;j<n;j++)
{
temp=a[t][j];
a[t][j]=a[i1][j];
a[i1][j]=temp;
}
t++;
break;
}
}
}
System.out.println("The array is:");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.println(a[i][j]);
}
}
}
}

