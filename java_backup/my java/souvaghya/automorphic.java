class automorphic
{
public static void main(String args[])
{
int s=0,f,k,m,i;
for(i=100;i<=999;i++)
{
k=i*i;f=0;s=0;
//System.out.println(i);
while(k>0)
{
m=k%10;
s=(s*10)+m;
//System.out.println(s);
int s1=0,s2=s;f=0;
while(s2>0)
{
int m1=s2%10;
s1=(s1*10)+m1;
s2=s2/10;
}
//System.out.println(s1);
if(i==s1)
{
f=1;
break;
}
k=k/10;
}
if(f==1)
System.out.println("automorphic"+i);
}
}
}
