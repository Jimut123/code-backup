import java.io.*;
class NxNmatrix
{
public static void amin(String args[])throws IOException
{
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
{
int i,j=0,n,k;
n=Integer.parseInt (br.readLine());
int a[][]=new int [n][n];
System.out.print("gine no.of rows");
for(i=0;i<n;i++)
for(j=0;j<n;j++)
a[i][j]=Integer.parseInt(br.readLine());
for(i=0;i<n;i++)
{
System.out.println(a[i][i]);
}
k=n-1;
for(i=0;i<n;i++)
{
System.out.println(a[i][k]);
k--;
}

}
}
}