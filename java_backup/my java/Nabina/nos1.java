import java.io.*;
class nos1
{
long prime(long x)
{
long f5=0,j2;
f5=0;
for(j2=2;j2<x;j2++)
{
if(x%j2==0)
{
f5=1;
break;
}
}
return f5;
}
long rev(long x)
{
long s5=0;
while(x>0)
{
s5=(s5*10)+(x%10);
x=x/10;
}
return s5;
}
public void main()throws IOException
{
long i,j,n,p,p1,p2=0,c=0,c1=0,c2=0,c3=0,s=0,s1=0,s2=0,s3=0;
double t;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in)); 
System.out.println("Enter a no.:");
n=Integer.parseInt(input.readLine());
j=n;
c=0;
while(j>0)
{
p=j%10;
p1=prime(p);
if(p1==0)
{
s=(s*10)+p;
c++;
}
j=j/10;
}
long s4=0;
System.out.println(s);
for(i=0;i<=9;i++)
{
s2=s;
while(s2>0)
{
if(s2%10==i)
 s4=(s4*10)+i;
s2=s2/10;
}
}
System.out.println(s4);
s=s4; 
j=rev(n);
System.out.println(j);
c1=0;
while(j>0)
{
p=j%10;
c1++;
p1=prime(p);
if(p1==1)
{
p2=p;
c2=c1;
break;
}
j=j/10;
}
System.out.println(p2);
t=Math.pow(10,c);
System.out.println(p2*(long)t);
s1=(p2*(long)t)+s;

j=j/10;
System.out.println("jj"+j);
c1=0;
while(j>0)
{
p=j%10;
c1++;
p1=prime(p);
if((p1==1))
{
s2=(s2*10)+p;
c3++;
}
j=j/10;
}
s3=(s1*(long)(Math.pow(10,c3)))+s2;
System.out.println("Your no. is :  "+s3);
}
}
