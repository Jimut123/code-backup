import java.io.*;
class PRINTLOWERUPPERTRIANGULARMATRIX
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a [][]=new int [50][50];
System.out.print("give term");
int i,j,n;
n=Integer.parseInt(br.readLine());
for(i=0;i<n;i++)
for(j=0;j<n;j++)
a[i][j]=Integer.parseInt(br.readLine());
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
System.out.print(a[i][j]+",");
System.out.println("");
}
for(i=0;i<n;i++)
{
for(j=i;j<n;j++)
System.out.print(a[i][j]+",");
System.out.println("");
}
for(i=0;i<n;i++)
{
for(j=0;j<i;j++)
System.out.print(a[i][j]+",");
System.out.println("");
}
}
}