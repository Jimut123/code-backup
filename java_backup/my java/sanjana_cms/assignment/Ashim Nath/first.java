import java.io.*;
class first
{
public static void main(int n) throws IOException
{
int i;
BufferredReader br=new BufferedReader (new InputStreamReader (System.in));
check();
{
int x;
System.out.pintln ("Press 1for armstrong number");
System.out.println("Press 2 for duck number");
System.out.println("Press 3 for krishnamurti number");
System.out.println("Enter choice");
switch(x)
{
arm()
{
case 1:
x=Integer.parseInt (br.readline());
s=0;
n1=n;
{
k=n1%10;
s=s+(k*k*k);
n1=n1%10;
}
if (s==n)
System.out.println("Armstrong number");
break;
}
duck()
{
case 2:
x=Integer.parse Int (br.readline());
n1=n;f=0;
while(n1>0)
{
k=n1%10;
if(k==0)
{
f=1;
break;
}
n1=n1%10;
}
if(f==0)
System.out.println("Duck number");
}
break;
krish()
{
case 3:
x=Intger.parseInt(br.readline());
n1=n;
s=0;
while(n1>0)
{
k=n1%10;
f=1;
for (j=1;j<=k;j++)
f=f*j;
s=s+f;
n1=n1%10;}
if(s==n)
System.out.println("krishnamurti number");
break;
}
}
}
}
}