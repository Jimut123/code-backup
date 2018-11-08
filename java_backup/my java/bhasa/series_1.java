
import java.io.*;
class series_1
{
public static void main (String args[])throws IOException
{
int n,j;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
n=Integer.parseInt(br.readLine());
j=1;
for (int i=1;i<=n;i=i+1)
{
System.out.print (j+",");
j=j+2;
}
}
}