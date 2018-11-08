import java.io.*;
class palindroprime
{
int n,c;
BufferedReader Input=new BufferedReader(new InputStreamReader(System.in));
void input()throws IOException
{
System.out.println("ENTER THE DIGIT");
n=Integer.parseInt(Input.readLine());
c=palprime(n);
if(c==1)
{
System.out.println("THE NUMBER IS PALINDROPRIME");
}
else
{
System.out.println("THE NUMBERE IS NOT PALINDROPRIME");
}
}
int palprime(int c)
{
int i,k,f=0,l,m,d=0,s=0;
for(i=2;i<n;i++)
{
k=n%i;
if(k==0)
{
//System.out.println(i);
f=1;
break;
}
}
if(f==0)
{

l=c;
while(l>0)
{
m=l%10;
//s=s+d;
s=(s*10)+m;
l=l/10;
}
}

if(s==c)
{
return 1;
}
else
{
return 0;
}
}
}
