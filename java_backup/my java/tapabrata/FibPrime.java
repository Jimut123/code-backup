class FibPrime
{public static void main(int n)
{int a=0,b=1;
int i,j,s;
int f;
for(i=1;i<=n;i++)
{int c=a+b;
f=0;
for(j=2;j<c;j++)
{if(c%j==0)
{f=1;
break;
}
}
if(f==0)
System.out.println(c);
a=b;
b=c;
}
}
}