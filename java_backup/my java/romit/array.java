import java.io.*;
class array
{
public static void main(String args[])throws IOException
{
BufferedReader Input =new BufferedReader(new InputStreamReader(System.in));
int n,i,j;
System.out.println("ENTER THE NO.");
n=Integer.parseInt(Input.readLine());
int A[][]=new int[n][n];
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
A[i][j]=0;
}
}
for(i=0;i<n;i++)
{
A[i][i]=1;
}
int k;
k=n-1;
for(j=0;j<n;j++)
{
A[j][k]=1;
k--;
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(A[i][j]!=1)
{
A[i][j]=Integer.parseInt(Input.readLine());
}
}
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(A[i][j]+" ");
}
System.out.println("");
}
}
}