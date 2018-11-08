class prime_check
{int i;
void primecheck()
{i=1;
}

void prime()
{
int k,j;
if(i>100)
return;
else
{
j=2;
k=check(i,j);
if(k==0)
System.out.println(i);
i=i+1;
prime();
}
}
int check(int x,int j)
{
if(j>(x-1))
return 0;
else
if(x%j==0)
return 1;
else
{
j=j+1;
return check(x,j);
}
}
}
