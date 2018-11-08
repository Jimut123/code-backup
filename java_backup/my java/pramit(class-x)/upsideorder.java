
import java.io.*;
class upsideorder
{
public static void main(String[]args)throws IOException
{
int i,j,n;
int a[][]=new int[100][100];
InputStreamReader aa=new InputStreamReader(System.in);
BufferedReader bb=new BufferedReader(aa);
System.out.print("Input range=");
n=Integer.parseInt(bb.readLine());
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.println("Input numbers=");
a[i][j]=Integer.parseInt(bb.readLine());
}
}
for(i=n-1;i>=0;i--)
{
for(j=0;j<n;j++)
{
System.out.print(a[i][j]);
}
System.out.println();
}
}
}