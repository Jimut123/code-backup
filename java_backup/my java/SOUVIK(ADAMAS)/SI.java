class SI
{
double p,r,t,si;
public void find (double a,double b,double c)
{
p=a;
r=b;
t=c;
si=p*r*t/100;
System.out.println ("Simple Interest ="+si);
}
public static void main (String s[])
{
SI k=new SI();
k.find (1100,6.5,2);
}
}
