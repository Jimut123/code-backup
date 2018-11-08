import java.io.*;
class primecheckR
{
int i,k,l;
void input()
{
l=2;
for(i=1;i<=100;i++)
{
k=primecheck(i,l);
if(k==0)
{
System.out.println("Prime No."+i);
}
else
{
System.out.println("Non Prime"+i);
}
}
}
int primecheck(int i,int l)
{
if(i%l==0)
{
return 1;
}
else if(i==l)
{
return 0;
}
else
{
return(primecheck(i,l+1));
}
}
}
