
import java.io.*;
class cow_sons
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,i,j,n1,p;
int a[][]=new int[100][100];
System.out.println("Enter no of sons:");
n=Integer.parseInt(br.readLine());
n1=1;
p=n*(3/2);
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

