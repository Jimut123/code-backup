class factorial_c
{
public static void main (int n)
{
int s=0,i,x=0,j=1,k,t,f;
t=1;
for(i=1;i<=n;i++)
{
x=1;
for(k=1;k<=j;k++)
x=x*j;
//System.out.println(x);
f=1; 
for(k=1;k<=j;k++)
f=f*k;
//System.out.println(f);
s=s+((x/f)*t);
//System.out.println(s);
t=t*-1;
j=j+2;
//System.out.println(j);
}
System.out.println(s);
}
}