class primecheck_conc
{
int i,f=0,x,k;
void start()
{
for(i=1;i<=100;i++)
{
x=prime(i);
if(x==0)
System.out.print(i+",");
}
}
int prime(int j)
{
int f,k;
f=0;
for(k=2;k<j;k++)
if(j%k==0)
{ 
f=1;
break;
}
return (f);
}
}