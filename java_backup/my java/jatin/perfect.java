

class perfect
{
int i,j,s;
void genperfect(int l, int u)
{
for(i=l;i<=u;i++)
{
perfecttest(i);
}   
}
void perfecttest(int i)
{
int s=0;
for(j=1;j<i;j++)
{
if(i%j==0)
s=s+j;
}
if(i==s)
System.out.println("Perfect:"+i);
}
}
