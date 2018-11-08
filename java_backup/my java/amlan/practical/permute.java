package practical;


import java.io.*;
class permute
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
char a[]=new char[100];
String s;
long t,t1,t2,n,n1,k1,s2,s3,m,f,j,k2;
int k,i,d;
void input()throws IOException
{
d=0;
System.out.println("Give Number/String:");
s=br.readLine();
t=s.length();
if(t>7)
{
System.out.println("Error give only 7 char");
System.exit(0);
}
k=1;
for(i=0;i<s.length();i++)
a[k++]=s.charAt(i);
k1=1;
n=0;
k=k-1;
while(k1<=k)
{
n=(n*10)+k1;
k1++;
}
//System.out.println(n);
n1=0;
k1=k;
s2=0;
while(k1>=1)
{
n1=(n1*10)+k1;
//System.out.println(n1);
f=1;
for(m=1;m<=k1;m++)
f=f*m;
s2=s2+f;
k1--;
}
//System.out.println(n1);
//System.out.println(s2);
permute();
}
void permute()
{
for(t=n;t<=n1;t++)
{
t1=t;
t2=0;
while(t1>0)
{
k2=t1%10;
if(k2==0)
{
t2=0;
break;
}
f=1;
for(m=1;m<=k2;m++)
f=f*m;
t2=t2+f;
t1=t1/10;
}
//System.out.println(t2);
if(s2==t2)
{
t1=t;
s3=0;
while(t1>0)
{
k=(int)t1%10;
s3=(s3*10)+k;
t1=t1/10;
}
while(s3>0)
{
k=(int)s3%10;
System.out.print(a[k]);
s3=s3/10;
}
d++;
System.out.println("");
}
}
System.out.println("Total Permutations are:"+d);
}
}



