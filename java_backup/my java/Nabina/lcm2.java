import java.io.*;
class lcm2
{
public static void main(String args[])throws IOException
{
int a,b,c,d,s=1,f,f1,i;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a no.:");
a=Integer.parseInt(input.readLine());
System.out.println("Enter another no.:");
b=Integer.parseInt(input.readLine());
if(a>=b)
{
c=a;
d=b;
}
else
{
c=b;
d=a;
}
s=1;
f=1;
while(f==1)
{
f1=0;
for(i=2;i<=d;i++)
{
if((c%i==0) &&(d%i==0))
{
s=s*i;
c=c/i;
d=d/i;
f1=1;
break;
}
}
if(f1==1)
f=1;
else
f=0;
}
s=s*c*d;
System.out.println("Your L.C.M. is:"+s);
}
}