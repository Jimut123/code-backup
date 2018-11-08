class LCM_GCD
{
public void GCD(int a,int b)
{
int c,d,k;
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
System.out.println("G.C.D"+d);
}

public void LCM(int a,int b)
{
int p=1;
while(a*p%b!=0)
p++;
System.out.print(" LCM IS:::"+ (a*p));
}
}