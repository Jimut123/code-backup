package testpaper.proj;

class palin extends number
{
void digit(int n)
{
int m=n;
int s=0;
while(m>0)
{
s=(s*10)+(m%10);
m=m/10;
}
if(s==n)
System.out.println("palindrome num : "+n);
else
System.out.println("non-palindrome!!!!!!!!!!!!!!!!!!!!!");
}
}

