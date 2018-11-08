package ass1;
import java.io.*;
class fact1
{
int i,n,f;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
void input()throws IOException
{
System.out.println("Give value:");
n=Integer.parseInt(br.readLine());
facto(n);
}
void facto(int n)
{
f=1;
for(i=1;i<=n;i++)
f=f*i;
System.out.println("The factorial"+f);
}
}