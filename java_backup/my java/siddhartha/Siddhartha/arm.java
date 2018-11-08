class  arm
{public static void main(double n)
{double p=n,s=0,a=0;
{while (n!=0);
{a=n%10;
s=s+a*a*a;
n=n/10;
}
if (p==s)
System.out.println("armstrong");
else
System.out.println("not armstrong");
}
}
}