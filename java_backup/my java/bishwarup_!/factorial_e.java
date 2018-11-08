class factorial_e
{
public static void main(int n)
{
int s=0,i,x,j=1,f,k,t=1;
for(i=1;i<=n;i++)
{
x=1;
for(k=1;k<=2;k++)
x=x*j;
f=1;
for(k=1;k<=j;k++)
f=f*k;
s=s+(x/f);
j=j+2;
}
System.out.print(s);
}
}


