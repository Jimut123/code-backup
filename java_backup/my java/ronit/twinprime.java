import java.io.*;
class twinprime
{
int i=1,j,f=0,j1;
void calc()
{
for(i=1;i<=20;i++)
{
if(primecheck(i)==1)
{

for(j=i+1;j<=20;j++)
{
if(primecheck(j)==1)
{
//System.out.println(j);
if((i-j)==2 || (i-j)==-2)
{
System.out.println(i+","+j);
//break;
}
}
}
}
}
}
int primecheck(int x)
{
f=0;

for(j1=2;j1<x;j1++)
{
if(x%j1!=0)
{
f=1;
break;
}
}
if(f==1)
{
System.out.println(x);
return 0;
}
else
{

return 1;
}
}
}

