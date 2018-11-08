import java.io.*;
class matrixswap
{
public static void main(String args[])throws IOException
{
int i,j,g=1,n,k=0;
int c[]=new int[100];
int d[]=new int[100];
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter length of matrix:");
n=Integer.parseInt(input.readLine());
int a[][]=new int[n][n];
int b[][]=new int[n][n];
System.out.println("Enter no. for ("+n+"*"+n+") first matrix:");
g=1;
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.println("("+g+") Enter no.:");
a[i][j]=Integer.parseInt(input.readLine());
g++;
}
}
System.out.println();

System.out.println("Enter no. for ("+n+"*"+n+") second matrix:");
g=1;
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.println("("+g+") Enter no.:");
b[i][j]=Integer.parseInt(input.readLine());
g++;
}
}
System.out.println();

System.out.println("Your first matrix:");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println("");
}
System.out.println();

System.out.println("Your second matrix:");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(b[i][j]+" ");
}
System.out.println("");
}
System.out.println();

//your new matrix
for(i=0;i<n;i++)
{
g=i+1;
c[k]=a[i][g];
d[k]=b[g][i];
g++;
k++;
}
System.out.println("Upper of matrix1:");
for(i=0;i<k;i++)
{
System.out.print(c[i]+" ");
}

System.out.println("Upper of matrix2:");
for(i=0;i<k;i++)
{
System.out.print(d[i]+" ");
}
}
}