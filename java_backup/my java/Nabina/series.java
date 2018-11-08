import java.io.*;
class series
{
public static void main(String args[])throws IOException
{
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
int n;
System.out.println("Enter no of sons:");
n=Integer.parseInt(input.readLine());
int a[][]=new int[n][n];
int i,j;
int n1=1;
int p=n*(3/2);
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
a[(i-j+p)%n][(i*2-j+n)%n]=n1++;
}
}
System.out.println("The combination is:"); 
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(a[i][j]+",");
}
System.out.println("");
}
}
}







