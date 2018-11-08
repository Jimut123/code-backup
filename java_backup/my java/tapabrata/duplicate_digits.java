class duplicate_digits
{public static void main(int n)
{int max,min,i,f,d,n1,s=0;
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
for(i=min;i<=max;i++)
{n1=n;
f=0;
while(n1>0)
{d=n1%10;
if(d==i)
{f=1;
break;
}
n1=n1/10;
}
if(f==1)
s=(s*10)+i;
System.out.println(s);
}
}
}