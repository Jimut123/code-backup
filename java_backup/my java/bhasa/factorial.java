
import java.io.*;
class factorial
{
public static void main (String args[])throws IOException
{
int n,i;
int j=1;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
n=Integer.parseInt(br.readLine());
for (i=1;i<=n;i=i+1)
{
j=j*i;

}
System.out.print (j+"factorial");
}
}