import java.io.*;
class series
{
int i=1,s=0,p,q=1,n;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));

void input()throws IOException
{
System.out.println("Enter no.:");
n=Integer.parseInt(input.readLine());
create();
}

void create()
{
if(i<=n)
{
if(i%2!=0)
{
p=i;
p=p*q;
s=s+p;
q=q*(-1);
}
i++;
create();
}
else
{
System.out.println("Sum:"+s);
return;
}
}
}