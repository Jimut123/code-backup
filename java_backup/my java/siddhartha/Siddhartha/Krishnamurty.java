class Krishnamurty
{public static void main(int n)
{int m=0,fact=1,d=0,s=0,j;
for(m=n;m>0;m=m/10)
{
d=m%10;
fact=1;
for(j=1;j<=d;j++)
{
fact=fact*j;
}
s=s+fact;

}
if(s==n)
{System.out.println("Krishnamurty number");
}
else
{System.out.println("not a Krishnamurty number");
}
}}
