import java.io.*;
class abnormalsort
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
for(i=0;i<n;i++)
{
for(j=n-1;j>=0;j--)
{
System.out.print(a[j][i]);
}
System.out.println("");
}
}
}