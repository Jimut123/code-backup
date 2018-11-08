import java.io.*;
class UniqueMatrix
{
public static void main(String[]args)throws IOException
{
InputStreamReader aa=new InputStreamReader(System.in);
BufferedReader bb=new BufferedReader(aa);
int a[][]=new int[100][100];
int sum,sum2,sum3,sum1,i,j,n,c;
c=0;
sum=0;
sum1=0;
sum2=0;
sum3=0;
System.out.print("input range =");
n=Integer.parseInt(bb.readLine());
a=new int[n][n];
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.println();
System.out.print("input array element=");
a[i][j]=Integer.parseInt(bb.readLine());
}
}
for(i=0;i<n;i++)
{
sum=sum+a[i][c];
}
for(i=0;i<n;i++)
{
sum1=sum1+a[c][i];
}
for(i=0;i<n;i++)
{
sum2=sum2+a[i][i];
}
for(i=n-1;i>=0;i--)
{
sum3=sum3+a[i][i];
}
if(sum==sum1&&sum1==sum2&&sum2==sum3)
{
System.out.println("unique matrix");
}
}
}