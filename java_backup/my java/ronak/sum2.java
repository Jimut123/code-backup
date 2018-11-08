import java.io.*;
class sum2
{
public static void main(String args[])throws IOException
{
int i,n,f;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Give no.");
n=Integer.parseInt(br.readLine());
f=1;
for(i=1;i<=n;i++)
f=f*i;
System.out.print(f);
}
}
