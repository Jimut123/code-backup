import number1.digits.*;
class fun  extends demo
{
public void function(int n)
{
int j,s,c;
number1.digits ob=new number1.digits();
c=0;
//System.out.println("Total no of digits" +c);
c=ob.count(n);
System.out.println("Total no of digits" +c);
s=0;
for(j=1;j<n;j++)
{
if(n%j==0)
s=s+j;
}
if(s==n)
System.out.println(j+" is a perfect number");
else
System.out.println(j+" is a not perfect number");
}
}
