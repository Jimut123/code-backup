class position
{public static void main(int n)
{int i,d,s,max,min,n1,rev;
n1=n;
max=min=n%10;
while(n>0)
{d=n%10;
if(d>max)
max=d;
else
if(d<min)
min=d;
n=n/10;
}
rev=0;
n=n1;
while(n>0)
{d=n%10;
rev=(rev*10)+d;
n=n/10;
}
s=0;
while(rev>0)
{d=rev%10;
if(d==max)
{s=(s*10)+min;
}
else
if(d==min)
{s=(s*10)+max;
}
else
s=(s*10)+d;
rev=rev/10;
}
System.out.println(s);
}
}
