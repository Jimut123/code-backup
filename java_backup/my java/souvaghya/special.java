class special
{
void main()
{
int s=0,i,f=1,j,k,p;
for(i=100;i<=1000;i++)
{
j=i;
s=0;
while(j>0)
{
k=j%10;
f=1;
for(p=1;p<=k;p++)
f=f*p;
s=s+f;
j=j/10;
}

if(s==i)
System.out.println("special no"+i);

}
}
}