
import java.io.*;
class series1
{
public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
int p,k,i,l,n;
System.out.println("enter n");
n=Integer.parseInt(br.readLine());
p=n;
k=n;
for(i=1;i<=n;i++)
{
while(p>k)
{
System.out.print(p);
p--;
}
for(l=1;l<=k;l++)
{
System.out.print(k);
}
System.out.println(" ");
k=k-1;
p=n;
}
}
}


