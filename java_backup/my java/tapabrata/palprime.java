
class palprime
{
public static void main(int m, int n)
{
int i,j,f,t=0,k=0,s=0;
System.out.println("palprime number are ");
for(i=m;i<=n;i++)
{
f=0;
for(j=2;j<i;j++)
{
if(i%j==0)
{
f=1;
break;
}
}
if(f==0)
{
t=i;
s=0;
while(t>0)
{
k=t%10;
s=(s*10)+k;
t=t/10;
}
if(s==i)
System.out.println(i+", ");
}
}
}
}
