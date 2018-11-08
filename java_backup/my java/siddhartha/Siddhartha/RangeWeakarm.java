class RangeWeakarm
{public static void main(int n)
{int r=0,s=0,d=0,c=0,i=0;
double k=0;
for(i=1;i<=n;i++)
{d=i;
while(d>0)
{s=d%10;
r++;
d=d/10;
}
c=i;
while(c>0)
{s=c%10;
r--;
k=k + Math.pow(s,r);
c=c/10;
}
if(i==k)
{System.out.println(k);
}
}
}
}