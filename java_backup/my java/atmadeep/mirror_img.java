import java.io.*;
class mirror_img
{
public static void main(String args[])throws IOException
{
int n;
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
System.out.println("Enter the limit:");
n=Integer.parseInt(input.readLine());
int ar[][]=new int[n][n];
int i,j,k,t,t1;
System.out.println("Enter the numbers in array:");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
ar[i][j]=Integer.parseInt(input.readLine());
}
}
for(i=0;i<n;i++)
{
t=n/2;
for(j=0,k=n-1;j<t;j++,k--)
{
t1=ar[i][j];
ar[i][j]=ar[i][k];
ar[i][k]=t1;
}
}
System.out.println("The array is:");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(ar[i][j]+",");
}
System.out.println("");
}
}
}

