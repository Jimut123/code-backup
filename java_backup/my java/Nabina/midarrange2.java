import java.io.*;
class midarrange2
{
public static void main(String args[])throws IOException
{
long i,j,n,m=0,m1=0,s=0,s1=0,s2,max,l,p,count=0;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter no.:");
n=Integer.parseInt(input.readLine());
j=n;
while(j>0)
{
m++;
j=j/10;
}

// if(m%2==0)
// l=m/2;
// else
l=(m+1)/2;

j=n;
while(j>0)
{
p=j%10;
m1++;
if(m1==l)
{
System.out.println(p);
count++;
}
else
if(m1>l)
s=(s*10)+p;
else
if(m1<l)
s1=(s1*10)+p;
j=j/10;
}

j=s1;
s1=0;
while(j>0)
{
p=j%10;
s1=(s1*10)+p;
j=j/10;
}
m=m-1;
s2=10;
while(m>0)
{
if(s>0)
{
System.out.print(s%s2+"   ");
count++;
s=s/10;
}
if(s1>0)
{
System.out.print(s1%s2);
count++;
s1=s1/10;
}
// s2=s2*10;
System.out.println("");
m=m-2;
}
 if(m>count)
 System.out.print("0");

}
}