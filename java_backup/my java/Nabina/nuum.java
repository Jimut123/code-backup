//Merge sort of 2 numbers
import java.io.*;
class nuum
{
public static void main(String args[])throws IOException
{
int i,j,n,x,p,s=0,s1=0,s2=0,s3=0,m1=0,m2=0,s4=0,s5=0;
//double p1,p2;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter one no.:");
n=Integer.parseInt(input.readLine());
System.out.println("Enter another no.:");
x=Integer.parseInt(input.readLine());

for(i=0;i<=9;i++)
{
j=n;
while(j>0)
{
p=j%10;
m1++;
if(p==i)
s=(s*10)+p;
j=j/10;
}
}
//System.out.println(s);
for(i=0;i<=9;i++)
{
j=x;
while(j>0)
{
p=j%10;
m2++;
if(p==i)
s1=(s1*10)+p;
j=j/10;
}
}

while(s>0)
{
s4=(s4*10)+s%10;
s=s/10;
}
while(s1>0)
{
s5=(s5*10)+s1%10;
s1=s1/10;
}

s3=0;
while(s4>0 && s5>0)
{
p=s4%10;
j=s5%10;
if(p<j)
{
s3=(s3*10)+p;
s4=s4/10;
}
else
if(p>j)
{
s3=(s3*10)+j;
s5=s5/10;
}
else
{
s3=(s3*10)+p;
s4=s4/10;
s5=s5/10;
}
}
//System.out.println(s3);
//System.out.println("Your no. is:"+s4);
//System.out.println("Your no. is:"+s5);
if(s4>0)
{
while(s4>0)
{
s3=(s3*10)+s4%10;
s4=s4/10;
}
}
else
if(s5>0)
{
while(s5>0)
{
s3=(s3*10)+s5%10;
s5=s5/10;
}
}
//p1=s%(Math.pow(10,m1));
//p2=s%(Math.pow(10,m2));
System.out.println("Your no. is:"+s3);
}
}