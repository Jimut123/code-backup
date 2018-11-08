import java.io.*;
class EliminationSqr
{
public static void main(String[]args)throws IOException
{
InputStreamReader aa=new InputStreamReader(System.in);
BufferedReader bb=new BufferedReader(aa);
int n,i,p,q,n1,s,k,s1,a,sqr;
System.out.print("input any number=");
n=Integer.parseInt(bb.readLine());
a=0;
sqr=1;
n1=n;
while(n1>0)
{
p=n1%10;
n1=n1/10;
a++;
}
n1=n;
s=0;
s1=0;
sqr=0;
if(a>2)
{
while(n1>0)
{
k=n1%10;
s=(s*10)+k;
n1=n1/10;
}
s=s/10;
//s=n1;
s1=0;
while(s>0)
{
k=s%10;
if((s/10)<=0)
break;
else
s1=(s1*10)+k;
s=s/10;
}
}
sqr=s1*s1;
System.out.println("sqr is="+sqr);
}
}