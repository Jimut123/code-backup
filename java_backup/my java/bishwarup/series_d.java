class series_d
{
public static void main(int a,int b)
{
int d,c,k,m;
if(a>b)
{
c=a;
d=b;
}
else
{
c=b;
d=a;
}
while(c%d!=0)
{
k=c%d;
c=d;
d=k;
}
System.out.print(d);
}
}