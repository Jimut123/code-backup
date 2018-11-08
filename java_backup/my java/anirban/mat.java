import java.io.*;
class mat 
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int arr[][];
int i,n,j;
void Input()throws IOException
{
System.out.println("Enter row and column");
n=Integer.parseInt(br.readLine());
arr=new int[n][n];
}
void readdata()throws IOException
{
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
arr[i][j]=Integer.parseInt(br.readLine());
}
}
}
void boundary()
{
for(i=0;i<n;i++)
{
if(i==0||i==n-1)
{
for(j=0;j<n;j++)
System.out.print(arr[i][j]);
}
else
{
for(j=0;j<n;j++)
{
if(j==0||j==n-1)
System.out.print(arr[i][j]);
else
System.out.print(" ");
}
}
System.out.println();
}
}
}
