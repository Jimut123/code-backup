import java.io.*;
import java.lang.*;
class interchange
{
public static void main (String args[])throws IOException
{
BufferedReader Input=new BufferedReader(new InputStreamReader(System.in));
int i,j,N;
System.out.println("ENTER THE NUMBER");
N=Integer.parseInt(Input.readLine());
int A[][]=new int[N][N];
int B[][]=new int[N][N];
for(i=0;i<N;i++)
{
for(j=0;j<N;j++)
{
A[i][j]=Integer.parseInt(Input.readLine());
}
}
for(i=0;i<N;i++)
{
for(j=0;j<N;j++)
{
B[i][j]=A[j][i];
}
}
for(i=0;i<N;i++)
{
for(j=0;j<N;j++)
{
System.out.print(B[i][j]+",");
}
System.out.println("");
}
}
}