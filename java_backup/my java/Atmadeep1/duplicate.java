import java.io.*;
class duplicate
{
public static void main(String args[])throws IOException
{
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
long d,n,s=0,temp=0,c=0,count=0,n1,n2,max=0,min=0,i,f;
System.out.println("Enter the number");
n=Integer.parseInt(input.readLine());
n1=n;

n1=n;
max=n1%10;
min=n1%10;
while(n1>0)
{
if(n1%10>max)
max=n1%10;
else
if(n1%10<min)
min=n1%10;
n1=n1/10;
}
n2=0;
for(i=max;i>=min;i--)
{
n1=n;
f=0;
while(n1>0)
{
if(i==n1%10)
f++;
n1=n1/10;
}
if(f==1)
{
n2=(n2*10)+i;
}
}
while(n2>0)
{
d=n2%10;
temp=(temp*10)+d;
n2=n2/10;
}
n2=temp;
System.out.println("The no is:" +n2);
}
}



