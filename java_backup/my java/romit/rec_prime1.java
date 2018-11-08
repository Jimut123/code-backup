import java.io.*;
class rec_prime1
{
int i,k,l;
void input()
{

for(i=1;i<=100;i++)
{
l=2;
k=primecheck(i,l);
if(k==0)
{
System.out.println("Prime No."+i);
}

}
}
int primecheck(int i,int l)
{
if(i==l)
{
return 0;
}
else
if(i<l)
return 0;
else if(i%l==0)
{
return 1;
}
else
{
return(primecheck(i,l+1));
}
}
}
