import java.io.*;
class Product_Matrices
{
public static void main (String args [])throws IOException
{
InputStreamReader read = new InputStreamReader(System.in);
BufferedReader x = new BufferedReader(read);
int n,i = 0,j = 0,k = 0;
System.out.print("ENTER THE ORDER OF THE TWO MATRICES:");
n = Integer.parseInt(x.readLine());
int s[][] = new int[n][n];
int t[][] = new int[n][n];
int p[][] = new int[n][n];
System.out.println("ENTER THE ELEMENTS OF THE FIRST MATRIX:");
for(i = 0;i < n;i++)
{
for(j = 0;j < n;j++)
{
s[i][j] = Integer.parseInt(x.readLine());
 }
}
System.out.println("ENTER THE ELEMENTS OF THE SECOND MATRIX:");
for(i = 0;i < n;i++)
{
for(j = 0;j < n;j++)
{
t[i][j] = Integer.parseInt(x.readLine());
 }
}
System.out.println("THE FIRST MATRIX:");
for(i = 0;i < n;i++)
{
for(j = 0;j < n;j++)      
{
System.out.print(s[i][j]+" ");
}
System.out.println();
}
System.out.println("THE SECOND MATRIX:");
for(i = 0;i < n;i++)
{
for(j = 0;j < n;j++)
{
System.out.print(t[i][j]+" ");
}
System.out.println();
}
for(i = 0;i < n;i++)
{
for(j = 0;j < n;j++)
{
p[i][j] = 0;
for(k = 0;k < n;k++)
{
p[i][j] = p[i][j] + (s[i][k] * t[k][j]);
  }
 }
}
System.out.println("THE PRODUCT MATRIX OF TWO MATRICES:");
for(i = 0;i < n;i++)
{
for(j = 0;j < n;j++)
{
System.out.print(p[i][j]+" ");
}
System.out.println();
  }
 }
}
