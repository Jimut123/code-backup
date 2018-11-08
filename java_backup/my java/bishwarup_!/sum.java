 

class sum
{
public static void main(int n)
{
int i,j,f,t; double s=0,k;
f=1;k=0;t=-1;
for(i=1;i<=n;i++)
{
t=1;
k=0;
for(j=1;j<=i;j++)
{
k=k+(j*t);
t=t*-1;
}
s=s+(double)i/(double)k;
}
System.out.println("sum: "+s);
}
}
