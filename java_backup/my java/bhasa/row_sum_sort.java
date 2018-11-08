import java.io.*;
class row_sum_sort
{
public static void main(String args[])throws IOException
{
int n,i,j,m,s,t,t1,x,maxpos,max;
max=0;maxpos=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter row no.");
m=Integer.parseInt(br.readLine());
System.out.println("enter coloumn no.");
n=Integer.parseInt(br.readLine());
x=n+1;
int a[][]=new int[m][x];
for(i=0;i<m;i++)
{
for(j=0;j<x-1;j++)
{
System.out.println("ENTER VALUE FOR POSITION"+"("+i+","+j+")");
a[i][j]=Integer.parseInt(br.readLine());
}
}
System.out.println("ORIGINAL MATRIX");
for(i=0;i<m;i++)
{
for(j=0;j<x-1;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}
for(i=0;i<m;i++)
{
s=0;
for(j=0;j<x-1;j++)
{
s=s+a[i][j];
a[i][x-1]=s;
}
if(a[i][x-1]>max)
{
maxpos=i;
}
}
for(j=0;j<x-1;j++)
{
t1=a[maxpos][j];
a[maxpos][j]=a[0][j];
a[0][j]=t1;
}
for(i=1;i<m;i++)
{
if(a[i][x-1]>a[i-1][x-1])
{
for(j=0;j<x-1;j++)
{
t=a[i][j];
a[i][j]=a[i-1][j];
a[i-1][j]=t;
}
}
}
System.out.println("SORTED MATRIX");
for(i=0;i<m;i++)
{
for(j=0;j<x-1;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}
}
}