import java.io.*;
import java.lang.*;
class primeAndmagicNo
{
public static void main(String args[])throws IOException
{
BufferedReader Input =new BufferedReader(new InputStreamReader(System.in));
int i,k,l,f=0,n,p=0,s=0;
for(i=1;i<=100;i++)
{
f=0;
for(k=2;k<i;k++)
{
if(i%k==0)
{
f=1;
break;
}
}
if(f==0)
{
n=i;
if(n==1)
{
System.out.println("The No.is magic and prime"+n);
}
else
{
while(n>=10)
{
p=n;
s=0;
while(p>0)
{
s=s+p%10;
p=p/10;
}
n=s;
}
if(n==1)
{
System.out.println("The No.is magic and prime"+" "+i);
}
}
}
}
}
}
