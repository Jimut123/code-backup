import java.io.*;
class numfreq2
{
public static void main(String args[])throws IOException
{
long i,j,n,n1=0,n2=0,p,s=0,s1=0,max=0,min=6,t=0;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter any no.:");
n=Integer.parseInt(input.readLine());

for(i=0;i<=9;i++)
{
j=n;
while(j>0)
{
p=j%10;
if(p==i)
s=(s*10)+p;
j=j/10;
}
}

max=0;
min=6;
for(i=0;i<=9;i++)
{
t=0;
j=n;
while(j>0)
{
p=j%10;
if(p==i)
t++;
j=j/10;
}
if(t>max)
{
max=t;
n1=i;
}
else
if(t<=min)
{
if(t>0)
{
min=t;
n2=i;
}
}
}

j=n;
while(j>0)
{
p=j%10;
if(p==n1)
s1=(s1*10)+p;
j=j/10;
}

j=n;
while(j>0)
{
p=j%10;
if((p!=n1)&&(p!=n2))
s1=(s1*10)+p;
j=j/10;
}

j=n;
while(j>0)
{
p=j%10;
if(p==n2)
s1=(s1*10)+p;
j=j/10;
}

System.out.println("The no. if placed according to frequency : "+s1);
}
}