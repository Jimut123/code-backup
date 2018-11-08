class pallin
{void digit(int n)
{int s=0,n1;
n1=n;
while(n>0)
{s=s*10+n%10;
n=n/10;
}
if(s==n1)
System.out.println("Pallindrome number " +n1);
else
System.out.println("Not pallindrome");
}
}