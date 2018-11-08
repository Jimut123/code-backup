import java.io.*;
class num
{
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
int n,i,j,s=0,s1=0,s2=0;
void perfect()throws IOException
{
System.out.println("Enter the number:");
n=Integer.parseInt(input.readLine());
while(n>0)
{
for(i=1;i<=n;i++)
{
if(n%i==0)
{
s=s+n;
}
}
if(s==n)
{
System.out.println("its perfect number:");
}
else
{
System.out.println("its not perfect number:");
}
}
}

void arms()throws IOException
{
System.out.println("Enter the number:");
n=Integer.parseInt(input.readLine());
while(n>0)
{
int d=n%10;
s1=s1+(d*d*d);
n=n/10;
}
if(s1==n)
{
System.out.println("its armstrong number:");
}
else
{
System.out.println("its not armstrong number:");
}
}

void krish()throws IOException
{
System.out.println("Enter the number:");
n=Integer.parseInt(input.readLine());
while(n>0)
{
int f=1;
for(i=1;i<=n;i++)
{
f=f*i;
}
for(j=1;j<=f;j++)
{
s2=s2+f;
}
if(s2==n)
{
System.out.println("its krishnamurthy number:");
}
else
{
System.out.println("its not krishnamurthy number:");
}
}
}
}

















