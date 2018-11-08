import java.io.*;
class transpose
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,j,n;
int a[][]=new int [100][100];
int b[][]=new int [100][100];
System.out.println("give the matrix's elements");
n=Integer.parseInt(br.readLine());
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
a[i][j]=Integer.parseInt(br.readLine());
}
System.out.println("matrix:");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
System.out.print(a[i][j]+",");
System.out.println("");
}
System.out.println("transpose:");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
b[i][j]= a[j][i];
System.out.print(b[i][j]+",");
}
System.out.println("");
}
}
}
