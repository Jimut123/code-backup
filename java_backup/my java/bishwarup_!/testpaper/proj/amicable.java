package testpaper.proj;

class amicable extends numbers
{
int s2;
void cal(int n2)
{
s2=0;
for(int j=1;j<n2;j++)
if(n2%j==0)
s2+=j;
System.out.println("sum of factors  2 : "+s2);
if(m==s2 && n2==s1)
System.out.println("AMICABLE num : "+m+", "+n2);
else
System.out.println("non amicable!!!!!!!!!!!!!!!!!");
}
}
