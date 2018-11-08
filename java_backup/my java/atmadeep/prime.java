import java.io.*;
class prime extends pallindrome
{
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
int i,f=0,k;
void input1()throws IOException
{
super.input();
k=super.n;
if(super.pallin(k)==1)
{
primechk();
}
}
void primechk()
{
for(i=2;i<k;i++)
{
if(k%i==0)
{
f=1;
break;
}
}
if(f==1)
System.out.println("The number is not prime :");
else if(f!=1)
System.out.println("The number is prime & palindrom :");
}
}