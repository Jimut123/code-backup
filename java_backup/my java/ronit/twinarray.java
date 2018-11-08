import java.io.*;
class twinarray
{
int i,j,n,f;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
void input()throws IOException 
{
System.out.println("ENTER A NO:");
n=Integer.parseInt(br.readLine());
int a[]=new int[100];
for(i=0;i<n;i++)
{
a[i]=Integer.parseInt(br.readLine());
}
for(i=0;i<n;i++)
{
//System.out.println(primecheck(a[i]));
if(primecheck(a[i])==1)
{
for(j=i+1;j<n;j++)
{
//System.out.println(primecheck(a[j]));
//if(j==n)
//break;
if(primecheck(a[j])==1)
{
//System.out.println(a[j]+","+a[i]);
int m=a[i]-a[j];
//System.out.println(m);
if(m==2|| m==-2)
{
System.out.println(a[i]+","+a[j]);
}
}
}
}
}
}
int primecheck(int x)
{
f=0;
for(int j1=2;j1<x;j1++)
{
if(x%j1==0)
{
f=1;
break;
}
}
if(f==1)
{
//System.out.println(x);
return 0;
}
else
{
return 1;
}
}
}

