class fibonacci
{
public static void main(int n)
{
int i,a,b,c;
a=0;
b=1;
System.out.println(a+",");
System.out.println(b+",");
for(i=1;i<=n-2;i++)
{
c=a+b;
System.out.println(c+",");
a=b;
b=c;
}
}
}

