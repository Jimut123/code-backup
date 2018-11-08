import java.io.*;
class twistedprimeno
{
public static void main(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
int i,n,r=0,d,p,x=1,y=1;
System.out.println("Enter any number");
n=Integer.parseInt(cd.readLine());
for(i=2;i<n;i++)
{
if(n%i==0)
x=0;
}
p=n;
while(n!=0)
{
d=n%10;
r=r*10+d;
n=n/10;
}
for(i=2;i<n;i++)
{
if(r%i==0)
y=0;
}
if((x==1)&&(y==1))
{
System.out.println(p+"is twisted prime");
}
else
{
System.out.println(p+"is not twisted prime");
}
}
}
