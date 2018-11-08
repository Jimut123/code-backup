import java.io.*;
class binaryseries
{
int t=0,q,i1,n,m1,i;
int b[]=new int[100];
double m;
binaryseries()
{
for(i1=0;i1<100;i1++)
b[i1]=0;
}
void Decbin(int x)
{
t=0;
while(x>0)
{
b[t++]=x%2;
x=x/2;
}
for(i1=n-1;i1>=0;i1--)
System.out.print(b[i1]);
}
public void main1()throws IOException
{
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter length of last binary no. of series:");
n=Integer.parseInt(input.readLine());
int a[]=new int[n];
m=Math.pow(2,n);
m1=(int)m;
for(i=0;i<m1;i++)
{
Decbin(i);
System.out.print("="+i);
System.out.println("");
}
}
}







