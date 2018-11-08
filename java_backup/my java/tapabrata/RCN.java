class RCN
{
int digpro(int n)
{
if(n==0)
return 1;
else
return (((n%10)*digpro(n/10)));
}
}