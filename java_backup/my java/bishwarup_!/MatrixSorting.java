import java.io.*;
class MatrixSorting
{
public static void main(int n)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a[][]=new int [100][100];
int i,j,k,l,t;
t=0;
System.out.println("give the array elements:");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
a[i][j]=Integer.parseInt(br.readLine());
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
System.out.print(a[i][j]+",");
System.out.println("");
}
System.out.println("");
System.out.println("sorted matrix:");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
for(k=0;k<n;k++)
{
for(l=0;l<n;l++)
{
if(a[i][j]<a[k][l])
{
//System.out.println(a[i][j]+","+a[k][l]);
t=a[i][j];
a[i][j]=a[k][l];
a[k][l]=t;
//System.out.println(a[i][j]+","+a[k][l]);
}
}
}
}
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
System.out.print(a[i][j]+",");
System.out.println("");
}
}
}
