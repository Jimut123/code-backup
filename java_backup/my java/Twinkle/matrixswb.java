import java.io.*;
class matrixswb
{
public static void main(String args[])throws IOException
{
int a[][]=new int[100][100];
int n,g=1,j,i,temp;

BufferedReader input=new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter any no.:");
n=Integer.parseInt(input.readLine());

System.out.println("Enter no.s into ("+n+"*"+n+") matrix");
g=1;
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.println("("+g+") Enter a no.");
a[i][j]=Integer.parseInt(input.readLine());
g++;
}
}

System.out.println("Unchanged Matrix :");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println("");
}

for(j=0;j<n;j++)
{
temp=a[0][j];
a[0][j]=a[n-1][j];
a[n-1][j]=temp;
}
for(i=1;i<n-1;i++)
{
temp=a[i][0];
a[i][0]=a[i][n-1];
a[i][n-1]=temp;
}

System.out.println("Changed Matrix :");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println("");
}

}
}