import java . io.*;
class abs
{
public static void main(String args[])throws IOException
{
int i=1,n=1,sp,k,j,m,x;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
x = Integer.parseInt(br.readLine());
m=1;
sp=25;
for (i=1; i<=n; i++)
{
for (k=i; k<=sp; k++)
System.out.println(" ");
for (j=i; j<=m; j++)
System.out.println("*"+"");
m = m + 2;
sp = sp - 2;
System.out.println("");
}
}
}