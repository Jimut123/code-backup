class CapricornNumbers
{
public static void main(long v)
{
int i,m,k,t,s;
m=k=t=s=0;
System.out.println("Capricorn numbers:");
for(i=1;i<=v;i++)
{
s=0;
t=i;
m=t*t;
while(m>0)
{
k=m%10;
s=s+k;
m=m/10;
}
if(s==i)
System.out.print(i+", ");
}
}
}