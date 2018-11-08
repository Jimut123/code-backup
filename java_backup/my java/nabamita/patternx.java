import java.io.*;
class patternx
{
public static void main(String args[])throws IOException
{
int i,j,k,l,n;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
n=Integer.parseInt(br.readLine());
k=n-1;
for(i=1;i<=n;i++)
{
for(l=1;l<=k;l++)
System.out.print("");
for(j=1;j<=i;j++)
System.out.print("x");
System.out.println();
k=k-l;
}
k=k+2;
for(i=n-1;i>=1;i--)
{
for(l=1;l<=k;l++)
System.out.print("");
for(j=1;j<=i;j++)
System.out.print("x");
System.out.println();
k=k+1;
}
}
}
