import java.io.*;
class function 
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
void main()
{
int i,m,k;
for(i=1;i<=100;i++)
{
k=primecheck(i);
if(k==1)
System.out.println("prime no. are"+i);
}
}

int primecheck(int a)
{
int f=0,s=0,j;
for(j=2;j<a;j++)
{
if(a%j==0)
{
f=1;
break;
}
}
if(f==0)
return 1;
else
return 0;
}
}