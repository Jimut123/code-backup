class Prime2
{public static void main(int n)
{int i,j,c=0;
for(i=1;i<=n;i++)
{c=0;
for(j=1;j<=i;j++)
if(i%j==0)
{
c++;
}}
if(c==2)
{System.out.println(n+" is a prime  number");
}
else
{System.out.println(n+" is not a prime  number");
}
}
}


