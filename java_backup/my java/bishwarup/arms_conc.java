class arms_conc
{
int i,x,n;
void input()
{
for(i=100;i<=999;i++)
{
x=armcheck(i);
if(x==1)
System.out.print(i+",");
}
}
int armcheck(int x1)
{
int s=0,k;
int x2=x1;
while(x2>0)
{
k=x2%10;
s=s+(k*k*k);
x2=x2/10;
}
if(s==x1)
return 1;
else
return 0;
}
}