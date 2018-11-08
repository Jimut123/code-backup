import java.io.*;
class factors
{
public static void main (String args[])throws IOException
{
int n,i;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
n=Integer.parseInt(br.readLine());
for (i=1;i<=n;i=i+1)
{
if (n%i==0)
System.out.print (i+",");
}
}
}