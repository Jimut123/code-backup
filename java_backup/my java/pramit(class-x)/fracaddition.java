import java.io.*;
class fracaddition
{
int i,n,j,k;
InputStreamReader aa=new InputStreamReader(System.in);
BufferedReader ll=new BufferedReader(aa);
public void intake()throws IOException
{
System.out.print("the limit number=");
n=Integer.parseInt(ll.readLine());
}
public void calculate()
{
k=65;
for(i=1;i<=n;i++)
{
for(j=1;j<=i;j++)
System.out.print((char)k);
System.out.print("\n");
k++;
}
}
}

