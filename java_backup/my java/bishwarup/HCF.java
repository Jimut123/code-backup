class HCF
{
public static void main(int n)
{
int i,HCF=0,a=0,b=0;
for(i=1;i<=n/2;i++)
{
if(a%i==0&&b%i==0)
HCF=i;
}

System.out.print("H.C.F" + HCF);
System.out.print("L.M.C" + a*b + HCF);
}
}