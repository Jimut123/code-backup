import java.io.*;
class recurarmstrong
{
int n,j,p,s=0;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));

recurarmstrong()throws IOException
{
System.out.println("Enter no.:");
n=Integer.parseInt(input.readLine());
j=n;
digit();
}

void digit()
{
if(j==0)
{
if(s==n)
{
System.out.println("Armstrong no.:"+n);
}
else
{
System.out.println("Not armstrong no.:"+n);
}
return;
}
else
{
p=j%10;
s=s+(p*p*p);
j=j/10;
digit();
}
}
}