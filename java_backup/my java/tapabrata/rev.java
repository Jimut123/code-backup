class rev
{
int m,s;
void reverse(int n)
{
s=0;
m=n;
while(n>0)
{
s=(s*10)+(n%10);
n=n/10;
}
System.out.println("reversed num : "+s);
}
}
