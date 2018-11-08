import java.io.*;
class series
{
int p,n,j,i;
InputStreamReader aa=new InputStreamReader(System.in);
BufferedReader ll=new BufferedReader(aa);
public void intake()throws IOException
{
System.out.print("print 1st number=");
n=Integer.parseInt(ll.readLine());
}
public void calculate()
{
p=n;
i=n;
while(i>=1)
{
while(p>i)
{
System.out.print(p);
p--;
}
for(j=1;j<=i;j++)
System.out.print(i);
i--;
p=n;
System.out.println("");
}
}
}