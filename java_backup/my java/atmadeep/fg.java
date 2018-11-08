class prime extends pallindrome
{
int i,f=0,k;
void input1()throws IOException
{
k=super.n;
super.input();
if(super.pallin(k)==1)
{
primechk();
}
}
void primechk()
{
for(i=0;i<k;i++)
{
if(k%i==0)
{
f=1;
break;
}
}
if(f==1)
System.out.println("The number is not prime:");
else if(f==0)
System.out.println("The number is prime:");
}
}