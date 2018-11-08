class aumorphica
{
public static void main(int n)
{
int k,s,f,m,s1,s2,m1;
k=n*n;
s=0;f=0;
while(k>0)
{
m=k%10;
s=(s*10)+m;
s1=0;s2=s;
while(s2>0)
{
m1=s2%10;
s1=(s1*10)+m1;
s2=s2/10;
}
if(n==s1)
{
f=1;
break;
}
k=k/10;
}
if(f==1)
System.out.print("automorphic"+n);
else
System.out.print("non-automorphic"+n);
}
}



