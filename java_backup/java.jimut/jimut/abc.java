import java.io.*;
class abc
{
public static void main(String args[])throws IOException
{
int n,i,sp,k,j,m;
BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
n = Integer.parseInt(br.readLine());
m = 1;
sp = 25;
for (i = 1; i <= n ; i++)
{
for (k = 1; k <= sp ; k++)
System.out.print(" ");
for ( j= 1; j <= m ; j++)
System.out.print("*"+" ");
m = m +2;
sp = sp - 2;
System.out.println("");
}
}
}