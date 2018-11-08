class digit extends number
{void digit(int n)
{int s=0;
while(n>0)
{s=s+n%10;
n=n/10;
}
System.out.println("Sum of digits " +s);
}
}