class sum_of_digits
{int c,c1,n;
void main()
{c=0;
c1=sum(n);
System.out.println(c1);
}
int sum(int n1)
{if(n1==0)
return c;
else
{
c=c+n1%10;
return sum(n1/10);
}
}
}