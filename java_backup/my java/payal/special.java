
import java.io.*;
class special
{
int n,i,k,s,f,n1;
public special()
{
n=0;
}
public special(int i)
{
n=i;
}
public void sum()
{
s=0;
n1=n;
s=s+n%10;
while(n>0)
{
k=n%10;
n=n/10;
}
s=s+k;
System.out.println("THE SUMMATION OF FIRST AND LAST DIGIT OF N="+s); 
n=n1;
}
public void isSpecial()
{
n1=n;s=0;
while(n1>0)
{
k=n1%10;
f=1;
for(i=1;i<=k;i++)
{
f=f*i;
}
s=s+f;
n1=n1/10;
}
if(s==n)
System.out.println("THE SPECIAL NUMBER ="+s);
else
System.out.println("IT IS NOT A SPECIAL NUMBER");
}
}