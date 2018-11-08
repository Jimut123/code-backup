package project;
import java.io.*;
class magic
{
public void main1()throws IOException
{
int n1,k=0,p=0,n;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter Your number:");
n=Integer.parseInt(br.readLine());
if(n==1)
{
System.out.print("magic");
}
else
{
n1=n;
while(n1>=10)
{
p=n1;
int s=0;
while(p>0)
{
k=p%10;
s=s+k;
p=p/10;
}
n1=s;
}
if(n1==1)
System.out.print("magic");
else
System.out.print(" non-magic");
}
}
}