import java.io.*;
class recurseries
{
int n,i,r=3,c=0,p=2,s=0;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
void input()throws IOException
{
System.out.println("Enter no.:");
n=Integer.parseInt(input.readLine());
series();
}
void series()
{
if(c<n)
{
s=s+p;
p=p+r;
r=r+3;
c++;
series();
}
else
{
System.out.println("Sum:"+s);
return;
}
}
}