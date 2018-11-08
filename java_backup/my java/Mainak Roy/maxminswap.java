import java.util.*;
public class maxminswap
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
int p=sc.nextInt();
int c=0;
int k=p;
while(k>0)
{
c=c+1;
k=k/10;
}
k=p;
int u=k;
int a=10;
int n=0;
for(int i=0;i<c;i++)
{
if(u%10>n)
{
n=u%10;
}

if(u%10<a)
{
a=u%10;
}

}
int o=k;
int h=0;
for(int i=1;i<=c;i++)
{
if(o%10==a)
{
h=h*10;
h=h+n;
}
else if(o%10==n)
{
h=h*10;
h=h+a;
}
else
{
h=h*10;
int abc=o%10;
h=h+abc;
}
o=o/10;
}
System.out.println(h);
int x=0;
for(int i=0;i<c;i++)
{
x=x*10;
int ahh=h%10;
x=x+ahh;
h=h/10;
}
System.out.println(x);
}
}
