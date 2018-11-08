import java.io.*;
class abc
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the no");
int n,i,j;
n=Integer.parseInt(br.readLine());
int m[][]=new int[n][n];
for(i=0;i<n;i++)
for(j=0;j<n;j++)
{
System.out.println("Give values:");

}
for(i=0;i<n;i++)
{
if(i==0||i==n-1)
{
for(j=0;j<n;j++)
{
System.out.print(m[i][j]);
}
}
else
for(j=0;j<n;j++)
{
if(j==0||j==n-1)
System.out.print(m[i][j]);
else
System.out.print(" ");
}
System.out.println("");
}
}
}