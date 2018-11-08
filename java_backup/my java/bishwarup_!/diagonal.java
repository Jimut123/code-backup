import java.io.*;
class diagonal
{
public static void main(String args[])throws IOException
{
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
int n,i,j,k;
System.out.println("give limit");
n=Integer.parseInt(br.readLine());
int a[][]=new int[n][n];
for(i=0;i<n;i++)
for(j=0;j<n;j++)
//left diagonal
for(i=0;i<n;i++)
System.out.print(a[i][i]);
//right diagonal
k=0;
for(i=n-1;i>=0;i--)
{
System.out.print(a[k][i]);
k++;
}
}
}