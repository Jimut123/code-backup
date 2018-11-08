import java.io.*;
class boundaryline
{
public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
int n,i=0,j=0;
System.out.println("ENTER N:");
n=Integer.parseInt(br.readLine());

int a[][]=new int[n][n];
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
a[i][j]=Integer.parseInt(br.readLine());
}
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
System.out.print(a[i][j]+",");
System.out.println("");
}
for(i=0;i<n;i++)
{
System.out.println(a[0][i]);
}
for(i=1;i<n;i++)
{
System.out.println(a[i][n-1]);
}
for(i=n-2;i>=0;i--)
{
System.out.println(a[n-1][i]);
}
for(i=n-2;i>0;i--)
{
System.out.println(a[i][0]);
}
}
}