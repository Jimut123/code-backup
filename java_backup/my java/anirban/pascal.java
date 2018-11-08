
import java.io.*;
class pascal
{
int a[][]=new int[100][100];
int i,j,k,n;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
void input()throws IOException
{
System.out.println("Give n:");
n=Integer.parseInt(br.readLine());
for(i=0;i<n;i++)
for(j=0;j<=i;j++)
a[i][j]=1;
pascal();
}
void pascal()
{
for(i=2;i<n;i++)

for(j=1;j<i;j++)
{
a[i][j]=a[i-1][j-1]+a[i-1][j];
}
for(i=0;i<n;i++)
{
for(j=0;j<=i;j++)
System.out.print(a[i][j]+",");
System.out.println("");
}
}
}