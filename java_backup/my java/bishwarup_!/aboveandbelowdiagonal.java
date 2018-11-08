import java.io.*;
class aboveandbelowdiagonal
{
public static void main(String args[]) throws IOException
{
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
int i,j,n;
System.out.print("give no of rows");
System.out.print("give no of coloumn");
n=Integer.parseInt(br.readLine());
int a[][]=new int [n][n];
for(i=0;i<n;i++)
for(j=0;j<n;j++)
a[i][j]=Integer.parseInt(br.readLine());
{
for(i=0;i<n;i++)
for(j=0;j<i;j++)
System.out.print(a[i][j]);
}
{
for(i=0;i<n;i++)
for(j=i+1;j<n;j++)
System.out.print(a[i][j]);
}
}
}