package STRING;


import java.io.*;
class fibonacciforlop
{
public static void main(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
int a=0,b=1,c=0,i,n;
a=Integer.parseInt(cd.readLine());
b=Integer.parseInt(cd.readLine());
n=Integer.parseInt(cd.readLine());
System.out.println(a+" "+b);
for(i=1;i<=b;i++)
{
c=a+b;
System.out.println(c);
a=b;
b=c;
}
}
}
