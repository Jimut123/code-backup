
import java.io.*;
class UniqueNumber
{
public static void main(String[]args)throws IOException
{
InputStreamReader aa=new InputStreamReader(System.in);
BufferedReader bb=new BufferedReader(aa);
int i,q,j,m,n,p1,q1,p,l,a,k;
l=1;
a=0;
System.out.print("input lower limit number=");
m=Integer.parseInt(bb.readLine());
System.out.println();
System.out.print("input upper limit number=");
n=Integer.parseInt(bb.readLine());
for(i=m;i<n;i++)
{
for(j=i;j>=0;j--)
{
p=j%10;
q=j/10;
j=q;
for(k=i;k>=0;k--)
{
p1=k%10;
q1=k/10;
k=q1;
if(p1==p)
{
a++;
l=l*a;
}
}
a=0;
}
if(l==1)
{
System.out.println(i);
}
}
}
}