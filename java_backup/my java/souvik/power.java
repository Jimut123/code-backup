

class power
{

public static void main (int n,int x)
{
int i,s;
s=0;

for(i=1;i<=n;i++)
{
s=s+(int)Math.pow(x,i);
}
System.out.println(s);
}
}