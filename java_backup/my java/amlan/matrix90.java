import java.io.*;
class matrix90
{
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
int n;
int ar[][]=new int[100][100];
int i,j,k;
void input()throws IOException
{
System.out.println("Enter limit:");
n=Integer.parseInt(input.readLine());
int ar[][]=new int[n][n];
System.out.println("Enter numbers in array:");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
ar[i][j]=Integer.parseInt(input.readLine());
    }
}
System.out.println(" ");
System.out.println("The array is:");
for(i=n-1;i>=0;i--)
{
for(j=0;j<n;j++)
System.out.print(ar[j][i]);
System.out.println(" ");
    }
}
    }

