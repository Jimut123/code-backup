
import java.io.*;
import java.lang.*;
class primepalindrum
{
public static void main(String args[])throws IOException
{
BufferedReader Input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("ENTER THE NUMBER");
int n=Integer.parseInt(Input.readLine());
int i,j,f=0,k,g=0,n1;
n1=n;
for(i=2;i<n;i++)
{
j=n%i;
if(j!=0)
{
f=1;
}
}
if(f==1)
{
int s=0;
while(n>0)
{
k=n%10;
s=s+g;
g=(g*10)+k;
n=n/10;

if(n==s)
{
System.out.println("PRIMEPALINDRUM"+n1);
}
}
}
}
}





