import java.io.*;
class truthTABLE
{
int i,k,t,n;
int a[]=new int[100];
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
void input()throws IOException
{
System.out.println(":-------ENTER THE LAST LIMIT-------:");
n=Integer.parseInt(input.readLine());
n=(int)Math.pow(2,n);
for(i=0;i<100;i++)
a[i]=0;
for(i=0;i<n;i++)
{
bin(i);
System.out.println(" ");
}
}
void bin(int i)
{
t=0;
while(i>0)
{
k=i%2;
a[t++]=k;
i=i/2;
}
for(i=n-1;i>=0;i--)
System.out.print(a[i]);
}
}














