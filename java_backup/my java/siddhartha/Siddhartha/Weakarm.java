class Weakarm
{public static void main(int n)
{int r=0,s=0,d=0,c=0,i=0;
double k=0;
{d=n;
while(d>0)
{s=d%10;
r++;
d=d/10;
}
c=n;
while(c>0)
{s=c%10;
r--;
k=k + Math.pow(s,r);
c=c/10;
}
if(n==k)
{System.out.println("Weak Number");
}
else
{System.out.println("Not a Weak Number");
}
}
}
}