import java.io.*;
class newfunc
{
double k1=-1;
int n,i,j,p,p1,f,f1,f2,c,k=0,t=0,m,x1,max,min;
int a[]=new int[100];
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
void input()throws IOException
{
System.out.println("Enter no.:");
n=Integer.parseInt(input.readLine());
System.out.println(mobions(n));
}
double mobions(int x)
{
t=0;
k=-1;
while(x>1)
{

for(j=2;j<=x;j++)
{
if(x%j==0)
{
f1=0;
for(m=2;m<j;m++)
{
if(j%m==0)
{
f1=1;
break;
}
}
if(f1==0)
{
System.out.println(j);
a[t]=j;
t++;
}
x1=x/j;
break;
}
}
x=x1;
}
if(t>0)
{
max=a[0];
min=a[0];
for(j=0;j<t;j++)
{
if(a[j]>max)
max=a[j];
if(a[j]<min)
min=a[j];
}
System.out.println(max);
System.out.println(min);
for(i=max;i>=min;i--)
{
f=0;
for(j=0;j<t;j++)
{
if(a[j]==i)
f++;
}
if(f>1)
{
k1=0;
break;
}
}

if(k1!=0.0)
{
k1=Math.pow(k1,t);
}
}
return k1;
}
}
