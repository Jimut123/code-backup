import java.io.*;
class mat1
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,j,n,max,min;
System.out.println("Enter rows/columns");
n=Integer.parseInt(br.readLine());
int a[][]=new int[n][n];
for(i=0;i<n;i++)
for(j=0;j<n;j++)
a[i][j]=Integer.parseInt(br.readLine());
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
System.out.print(a[i][j]+" ");
System.out.println("");
}
for(i=0;i<n;i++)
{
min=a[i][0];
for(j=0;j<n;j++)
{
if(a[i][j]<min)
min=a[i][j];
}
System.out.println("Minimum or row:"+i+":"+min);
}

for(i=0;i<n;i++)
{
max=0;
for(j=0;j<n;j++)
{
if(a[j][i]>max)
max=a[j][i];
}
System.out.println("Maximum of column:"+i+":"+max);
}
}
}

