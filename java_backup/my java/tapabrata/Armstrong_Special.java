class Armstrong_Special
{
int i,a,k1,s1,k2,s2,b,j,f;
void call()
{
System.out.println("Armstrong numbers are...");
armstrong();
System.out.println("Special numbers are...");
special();
}
void armstrong()
{
for(i=100;i<=999;i++)
{
a=i;
s1=0;
while(a>0)
{
k1=a%10;
s1=s1+(k1*k1*k1);
a=a/10;
}
if(s1==i)
//System.out.println("armstrong numbers:");
System.out.println(s1+",");
}
System.out.println("");
}
void special()
{
for(i=100;i<=999;i++)
{
b=i;
s2=0;
while(b>0)
{
k2=b%10;
f=1;
for(j=1;j<=k2;j++)
f=f*j;
s2=s2+f;
b=b/10;
}
if(s2==i)
//System.out.println("special:");
System.out.println(s2+", ");
}
}
}
