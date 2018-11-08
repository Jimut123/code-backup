package testpaper.proj;

import testpaper.proj.number1.count;
class master extends demo
{
testpaper.proj.number1.count ob=new testpaper.proj.number1.count();
int m=0,s=0,j;
void input(int n)
{
m=n;
System.out.println("total number of digits : \n"+ob.cal(n));
function();
}
void function()
{
for(j=1;j<m;j++)
if(m%j==0)
s+=j;
if(s==m)
System.out.println("perfect number : \n"+m);
else
System.out.println("non perfect number !!!!!!!!!!!!!!!!!!");
}
}
