import java.io.*;
import java.lang.*;
class n1
{
int i,j,n,max,min,p,p1,s,s1;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
void input()throws IOException
{
System.out.println("Enter no.:");
n=Integer.parseInt(input.readLine());
}
void max_min()
{
max=n%10;
min=n%10;
j=n;
while(j>0)
{
p=j%10;
if(p>=max)
max=p;
else
if(p<min)
min=p;
j=j/10;
}
System.out.println("The maximum digit is:"+max);
System.out.println("The minimum digit is:"+min);
}
void rev()
{
j=n;
while(j>0)
{
p=j%10;
s=(s*10)+p;
j=j/10;
}
System.out.println("The reverse is:"+s);
}
void rev_max_min()
{
j=n;
s=0;
while(j>0)
{
p=j%10;
if(p==max)
p=min;
else
if(p==min)
p=max;
s=(s*10)+p;
j=j/10;
}
j=s;
s1=0;
while(j>0)
{
p1=j%10;
s1=(s1*10)+p1;
j=j/10;
}
System.out.println("The no. is:"+s1);
}
}
