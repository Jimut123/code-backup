import java.io.*;
class transpose
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n=0,i=0,j=0;
System.out.println("Enter number:");
n=Integer.parseInt(br.readLine());
int a[][]=new int[n][n];
int b[][]=new int[n][n];
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
a[i][j]=Integer.parseInt(br.readLine());
//b[j][i]=Integer.parseInt(br.readLine());
}
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
b[i][j]=a[j][i];
}
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
System.out.print(b[i][j]+",");
System.out.println("");
}
}
}