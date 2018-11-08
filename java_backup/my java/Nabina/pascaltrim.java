import java.io.*;
class pascaltrim
{
public static void main(String args[])throws IOException
{
int a[][]=new int[100][100];
int n,i,j,p=0,q;

BufferedReader input=new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter any no.:");
n=Integer.parseInt(input.readLine());

for(i=0;i<n;i++)
{
for(j=0;j<=i;j++)
{
a[i][j]=1;
}
}

// for(i=0;i<n;i++)
// {
// for(j=0;j<=i;j++)
// {
// System.out.print(a[i][j]+" ");
// }
// System.out.println();
// }

for(i=2;i<n;i++)
{
for(j=1;j<i;j++)
{
a[i][j]=a[i-1][j-1]+a[i-1][j];
}
}

for(i=0;i<n;i++)
{
for(j=0;j<=i;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println(" ");
}

}
}