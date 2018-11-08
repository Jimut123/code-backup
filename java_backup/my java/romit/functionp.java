import java.io.*;
import java.lang.*;
class functionp
{
BufferedReader Input=new BufferedReader(new InputStreamReader(System.in));
void input()throws IOException
{
int c,n;
System.out.println("Enter The No.");
n=Integer.parseInt(Input.readLine());
c=primecheck(n);
if(c==1)
{
System.out.println("The No. Is Prime:"+n);
}
if(c==0)
{
System.out.println("The No. Is Not Prime:"+n);
}
}
int primecheck(int c)
{
int i,k,m=0;
for(i=2;i<c;i++)
{
k=c%i;
if(k==0)
{
m=1;
break;
}
}
if(m==0)
{
m=1;
}
else 
if(m==1)
{
m=0;
}
return m;
}
}
