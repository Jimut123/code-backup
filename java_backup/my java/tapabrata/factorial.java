class factorial
{void sum(int x,int n)
{double s=x;
int i;
for(i=1;i<n;i++)
{if(pcheck(i)==0)
s=s-(Math.pow(x,i))/(fact(i));
else
s=s+(Math.pow(x,i))/(fact(i));
System.out.println(s);
}
}
int pow(int p1,int q)
{int i,p=1;
for(i=1;i<p1;i++)
{p=p*i;
}
return p;
}
int fact(int p)
{int i,f=1;
for(i=1;i<=p;i++)
f=f*i;
return f;
}
int pcheck(int q)
{
return q%2;
}
}