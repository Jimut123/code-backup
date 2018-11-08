package souvik11.matrix;

import java.io.*;
class diagonal_upper_half_and_lower_half
{
public static void main()throws IOException
 {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,n,j;
System.out.print("Enter the size of the matrix:");
n=Integer.parseInt(br.readLine());
int a[][]=new int[n][n];
System.out.print("Enter the matrix elements:");
for(i=0;i<n;i++)
for (j=0;j<n;j++)
a[i][j]=Integer.parseInt(br.readLine());
for(i=0;i<n;i++)
 {for (j=0;j<n;j++)
      System.out.print(a[i][j]+",");
  System.out.println(" ");
}
for(i=0;i<n;i++)
{for(j=i;j<n;j++)
System.out.print(a[i][j]);
System.out.println("");
}
for(i=0;i<n;i++)
{
{for(j=0;j<i;j++)
System.out.print(a[i][j]);
}
System.out.println("");
}}}