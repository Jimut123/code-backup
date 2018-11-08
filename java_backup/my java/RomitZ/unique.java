import java.io.*;
class unique
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,n,n1,f,k,k1,x,x1;
System.out.println("Give Lower Boundary");
x=Integer.parseInt(br.readLine());
System.out.println("Give Upper Boundary");
x1=Integer.parseInt(br.readLine());
for(i=x;i<=x1;i++)
{
n=i;
f=0;
while(n>0)
{
k=n%10;
n1=n/10;
while(n1>0)
{
k1=n1%10;
if(k1==k)
{
f=1;
break;
}
n1=n1/10;
}
if(f==1)
break;
n=n/10;
}
if(f==0)
System.out.print(i+",");
}
}
}