import java.io.*;
class symmetry
{
public static void main(String args[])throws IOException
{
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
int n;
int ar[][]=new int[100][100];
int i,j;
int t;
System.out.println("Enter no.");
n=Integer.parseInt(input.readLine());
for(i=0;i<n;i++)
for(j=0;j<n;j++)
ar[i][j]=0;
t=1;
for(i=0;i<n;i++)
for(j=0;j<n;j++)
if(ar[i][j]==0||ar[j][i]==0)
{
ar[i][j]=t;
ar[j][i]=t;
t++;
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(ar[i][j]+",");
}
System.out.println("");
}
}
}


