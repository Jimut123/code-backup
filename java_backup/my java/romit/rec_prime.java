
import java.io.*;
class rec_prime
{
BufferedReader Input=new BufferedReader(new InputStreamReader(System.in));
int i,k,m,n;
void input()throws IOException
{
System.out.println("Enter The No.");
n=Integer.parseInt(Input.readLine());
i=2;
k=primecheck(n,i);
if(k==0)
{
System.out.println("Prime No.");
}
else
{
System.out.println("Non Prime");
}
}
int primecheck(int n,int i)
{
if(n==i)
return 0;
else
if(n%i==0)
return 1;
else
{
return(primecheck(n,i+1));
}
}
}
