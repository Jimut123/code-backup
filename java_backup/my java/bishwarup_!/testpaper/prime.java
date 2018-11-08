package testpaper;

public class prime
{
public boolean isprime(int n)
{
int x=0;int count;
count=0;
for(x=2;x<n;x++)
{
if(n%x==0)
{
count++;
break;
}
}
if(count ==0)
return true;
else
return false;
}
public void twin_prime(int n)
{
int num=0;
if(isprime(n)==true)
{
num=n+2;
if(isprime(num)==true)
System.out.println("Twin prime numbers are:"+n+" "+num);
}
}
}
