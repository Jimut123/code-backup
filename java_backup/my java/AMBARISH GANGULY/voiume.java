class voiume
{
int a,b,c,dd;
double d,d1;
void vol(int s)
{
a=s;
b=a*a*a;
System.out.println("Volume of accube"+b);
}
void vol(int m,double r)
{
a=m;
d=r;
d1=((double)a/3)*3.14*(d*d*d);
System.out.println("Volume of a sphere"+d1);
}
void vol(int m,int n,int o)
{
a=m;
b=n;
c=o;
dd=a*b*c;
System.out.println("Volume of a cuboid"+dd);
}
}
