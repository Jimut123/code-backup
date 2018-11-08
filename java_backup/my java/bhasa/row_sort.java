import java.io.*;
class row_sort
{
public static void main(String args[])throws IOException
{
int n,i,j,k,t,m,l;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter row no.");
m=Integer.parseInt(br.readLine());
System.out.println("enter coloumn no.");
n=Integer.parseInt(br.readLine());
int a[][]=new int[m][n];
int b[]=new int[m];
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.println("ENTER VALUE FOR POSITION"+"("+i+","+j+")");
a[i][j]=Integer.parseInt(br.readLine());
}
}
System.out.println("ORIGINAL MATRIX");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}
for(i=0;i<m;i++)
{
for(k=0;k<n;k++)
{
for(l=0;l<n-k-1;l++)
{
if(a[i][l]>a[i][l+1])
{
t=a[i][l+1];
a[i][l+1]=a[i][l];
a[i][l]=t;
}
}
}
}
System.out.println("SORTED ARRAY");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}
}
}
