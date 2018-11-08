import java.io.*;
class twinprimeno
{
public static void main(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
int a,b,i,x=1,y=1;
System.out.println("Enter two numbers");
a=Integer.parseInt(cd.readLine());
b=Integer.parseInt(cd.readLine());
for(i=2;i<a;i++)
{
if(a%i==0)
x=0;
}
for(i=2;i<b;i++)
{
if(b%i==0)
y=0;
}
if((x==1)&&(y==1)&&(Math.abs(a-b)==2))
{
System.out.println("It is twim prime number");
}
else
{
System.out.println("It is not twin prime number");
}
}
}