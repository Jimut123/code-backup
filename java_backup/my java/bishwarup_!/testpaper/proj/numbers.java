package testpaper.proj;

class numbers
{
int s1,m;
void calc(int n1)
{
s1=0;m=n1;
for(int i=1;i<n1;i++)
if(n1%i==0)
s1+=i;
System.out.println("sum of factors 1 : "+s1);
}
}
