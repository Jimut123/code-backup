package STRING;


import java.io.*;
class swap3rdvariable
{
public static void main(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
int a,b,c;
System.out.println("Enter the values of a & b:");
a=Integer.parseInt(cd.readLine());
b=Integer.parseInt(cd.readLine());
c=Integer.parseInt(cd.readLine());
a=b;
b=c;
c=a;
System.out.println("Value of a-swap:"+a);
System.out.println("Value of b-swap:"+b);
}
}