import java.io.*;
class lcm
{
public static void main(String args[])throws IOException
{
int a,b,x,y,l,h,temp;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter no.:");
a=Integer.parseInt(input.readLine());
System.out.println("Enter another no.:");
b=Integer.parseInt(input.readLine());
if(a>b)
{
x=a;
y=b;
}
else
{
x=b;
y=a;
}
while(x%y>1)
{
temp=x%y;
x=y;
y=temp;
}
System.out.println("G.C.M. :"+y);
l=(a*b)/y;
System.out.println("L.C.M. :"+l);
}
}

