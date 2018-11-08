
import java.io.*;
class mat_bound
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,n,j;
int a[][]=new int[100][100];
System.out.println("give n");
n=Integer.parseInt(br.readLine());
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
a[i][j]=Integer.parseInt(br.readLine());
}
}
i=0;
for(j=0;j<n;j++)
System.out.println(a[i][j]+" ");
j=n-1;
i=i+1;
while(i<n)
{
System.out.println(a[i][j]+" ");
i++;
}
i=n-1;
j=n-2;
while(j>=0)
{
System.out.println(a[i][j]+" ");
j--;
}
j=0;
i=n-2;
while(i>0)
{
System.out.println(a[i][j]+" ");
i--;
}
}
}