class Souvik
{
int a,b,c,f;
public void find(int x,int y,int z,int n)
{
int i,a,b,c,f,d;
a=x;
b=y;
c=z;
System.out .println(a+","+b+","+c);
f=0;

for(i=1;i<=n-3;i++)
{
f=a+b+c;
System.out.println(f);
a=b;
b=c;
c=f;
}
}
}


